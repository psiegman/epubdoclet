package nl.siegmann.epubdoclet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;

import nl.siegmann.epubdoclet.domain.ClassDocBean;
import nl.siegmann.epubdoclet.domain.DummyPackageBean;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.GuideReference;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.domain.TOCReference;
import nl.siegmann.epublib.epub.EpubWriter;
import nl.siegmann.epublib.service.MediatypeService;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.RootDoc;

public class EpubDoclet {

	private static final Logger log = LoggerFactory.getLogger(EpubDoclet.class);
	
	/**
	 * Start method for the doclet
	 * 
	 * @param root
	 * @return
	 */
	public static boolean start(RootDoc root) {
		VelocityEngine velocityEngine = createVelocityEngine();
		Template template = getTemplate("class", velocityEngine);
		ClassDoc[] classDocs = root.classes();
		Book book = new Book();
		for (int i = 0; i < classDocs.length; i++) {
			System.out.println("classdoc:" + classDocs[i].name());
			processClassDoc(classDocs[i], template, book);
		}
		fixEmptyPackageDescriptions(velocityEngine, book);
		addResources(book);
		try {
			(new EpubWriter()).write(book, new FileOutputStream("javadoc.epub"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private static void addResources(Book book) {
		try {
			Resource styleCssResource = new Resource(EpubDoclet.class.getResourceAsStream("/resources/css/style.css"), "css/style.css");
			book.addResource(styleCssResource);
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}
	
	
    private static VelocityEngine createVelocityEngine() {
	    VelocityEngine result = new VelocityEngine();
        result.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        result.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        result.setProperty("runtime.references.strict", true);
        result.init();
	    return result;
    }
    
    private static Template getTemplate(String templateName, VelocityEngine velocityEngine) {
        String templatePath = "templates/" + templateName + ".vm";
        Template template = velocityEngine.getTemplate(templatePath, "UTF-8");
        return template;
    }
	
	private static void processClassDoc(ClassDoc classDoc, Template template, Book book) {
        ClassDocBean classDocBean = new ClassDocBean(classDoc);
        classDocBean.setAboutMessage("Generated by epublib doclet on " + (new Date()));
        Resource resource = createResource(classDocBean, template);
        book.addResource(resource);
        book.getSpine().addResource(resource);
        book.getTableOfContents().addResourceAtLocation(resource, "classes." + classDocBean.qualifiedName(), "\\.");
        book.getGuide().addReference(new GuideReference(resource, "other.java.class", classDocBean.qualifiedName()));
	}
	
	private static void fixEmptyPackageDescriptions(VelocityEngine velocityEngine, Book book) {
		Template template = getTemplate("package", velocityEngine);
		fixEmptyPackageDescriptions(book, book.getTableOfContents().getTocReferences(), template);
	}

	private static void fixEmptyPackageDescriptions(Book book, List<TOCReference> tocReferences, Template template) {
		for(TOCReference tocReference: tocReferences) {
			if (tocReference.getResource() == null) {
				Resource resource = createDummyPackageResource(tocReference, template);
				book.addResource(resource);
				tocReference.setResource(resource);
			}
			fixEmptyPackageDescriptions(book, tocReference.getChildren(), template);
		}
	}

	private static Resource createDummyPackageResource(TOCReference tocReference, Template template) {
		String pageContent = generatePage("package", new DummyPackageBean(tocReference.getTitle(), "No description available"), template);
        String id = "java_package_" + tocReference.getTitle();
        String href = "java/classes/" + tocReference.getTitle();
        Resource resource = new Resource(id, pageContent.getBytes(), href, MediatypeService.XHTML);
        return resource;
		
	}

	private static Resource createResource(ClassDocBean classDocBean, Template template) {
        String pageContent = generateClassPage(classDocBean, template);
        String id = createId(classDocBean);
        String href = createHref(classDocBean);
        Resource resource = new Resource(id, pageContent.getBytes(), href, MediatypeService.XHTML);
        return resource;
	}

	private static String generateClassPage(ClassDocBean classDocBean, Template template) {
		return generatePage("clazz", classDocBean, template);
	}
	
	private static String generatePage(String beanName, Object bean, Template template) {
		VelocityContext context = new VelocityContext();
		context.put(beanName, bean);
		StringWriter writer = new StringWriter();
		template.merge(context, writer);
		writer.flush();
		return writer.toString();
	}
	
	private static String createId(ClassDoc classDoc) {
		return "java_class_" + classDoc.qualifiedName().replaceAll("\\.", "_");
	}
	
	private static String createHref(ClassDocBean classDocBean) {
		return "java/classes/" + classDocBean.qualifiedName() + ".html";
	}
}
