package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;

/**
 * Simplifies access to the ClassDoc object.
 * 
 * @author paul
 *
 */
public class ClassDocBean extends ClassDocWrapper {

	private String aboutMessage;
	
	public ClassDocBean(ClassDoc classDoc) {
		super(classDoc);
	}
	
	public void getMethodDocBeans() {
		MethodDoc[] methodDocs = classDoc.methods();
		
	}

	public String thePackage() {
		return qualifiedName().substring(0, qualifiedTypeName().lastIndexOf('.'));
	}

	public ClassDoc getClassDoc() {
		return classDoc;
	}

	public void setClassDoc(ClassDoc classDoc) {
		this.classDoc = classDoc;
	}

	public String aboutMessage() {
		return aboutMessage;
	}
	
	public void setAboutMessage(String aboutMessage) {
		this.aboutMessage = aboutMessage;
	}
}
