package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;

/**
 * Simplifies access to the ClassDoc object.
 * 
 * @author paul
 *
 */
public class ClassDocBean extends ClassDocBeanBase {

	private String aboutMessage;
	
	public ClassDocBean(ClassDoc classDoc) {
		super(classDoc);
	}

	public MethodDoc[] getMethods() {
		MethodDoc[] sourceMethodDocs = classDoc.methods();
		MethodDoc[] result = new MethodDoc[sourceMethodDocs.length];
		for (int i = 0; i < sourceMethodDocs.length; i++) {
			result[i] = new MethodDocBean(sourceMethodDocs[i]);
		}
		return result;
	}
	
	
	public void getMethodDocBeans() {
		MethodDoc[] methodDocs = classDoc.methods();
		
	}

	public String getPackage() {
		return qualifiedName().substring(0, qualifiedTypeName().lastIndexOf('.'));
	}

	public ClassDoc getClassDoc() {
		return classDoc;
	}

	public void setClassDoc(ClassDoc classDoc) {
		this.classDoc = classDoc;
	}

	public String getAboutMessage() {
		return aboutMessage;
	}
	
	public void setAboutMessage(String aboutMessage) {
		this.aboutMessage = aboutMessage;
	}
}
