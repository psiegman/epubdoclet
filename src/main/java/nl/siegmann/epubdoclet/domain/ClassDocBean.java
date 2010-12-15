package nl.siegmann.epubdoclet.domain;

import java.util.Comparator;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.MethodDoc;

/**
 * Simplifies access to the ClassDoc object.
 * 
 * @author paul
 *
 */
public class ClassDocBean extends ClassDocBeanBase {

	private String aboutMessage;
	private static Comparator<ClassDocBean> COMPARATOR_BY_QUALIFIED_NAME_IGNORE_CASE = new Comparator<ClassDocBean>() {

		@Override
		public int compare(ClassDocBean classDocBean1, ClassDocBean classDocBean2) {
			return String.CASE_INSENSITIVE_ORDER.compare(classDocBean1.getQualifiedName(), classDocBean2.getQualifiedName());
		}
	};
	
	public static Comparator<ClassDocBean> getComparatorByQualifiedNameIgnoreCase() {
		return COMPARATOR_BY_QUALIFIED_NAME_IGNORE_CASE;
	}
	
	public ClassDocBean(ClassDoc classDoc) {
		super(classDoc);
	}

	public FieldDocBean[] getFieldDocBeans() {
		FieldDoc[] fieldDocs = classDoc.fields();
		FieldDocBean[] result = new FieldDocBean[fieldDocs.length];
		for (int i = 0; i < fieldDocs.length; i++) {
			result[i] = new FieldDocBean(fieldDocs[i]);
		}
		return result;
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
