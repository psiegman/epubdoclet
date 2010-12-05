package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.MethodDoc;

public class MethodDocBean {

	private MethodDoc methodDoc;
	
	public MethodDocBean(MethodDoc methodDoc) {
		this.methodDoc = methodDoc;
	}

	public String getName() {
		return methodDoc.name();
	}
	
	public TypeDocBean getReturnType() {
		return new TypeDocBean(methodDoc.returnType());
	}
	
	public MethodDoc getMethodDoc() {
		return methodDoc;
	}

	public void setMethodDoc(MethodDoc methodDoc) {
		this.methodDoc = methodDoc;
	}
}
