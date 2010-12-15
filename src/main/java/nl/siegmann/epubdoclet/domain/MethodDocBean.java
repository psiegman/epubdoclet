package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.Parameter;

public class MethodDocBean extends MethodDocBeanBase {

	public MethodDocBean(MethodDoc methodDoc) {
		super(methodDoc);
	}

	public String getMethodId() {
		StringBuilder result = new StringBuilder();
		for(Parameter parameter : getParameters()) {
			if (result.length() > 0) {
				result.append(", ");
			}
			result.append(parameter.type().qualifiedTypeName());
		}
		return getName() + "(" + result.toString() + ")";
	}
	
//	public Type getReturnType() {
//		return new TypeDocBean(methodDoc.returnType());
//	}
	
	public MethodDoc getMethodDoc() {
		return methodDoc;
	}

	public void setMethodDoc(MethodDoc methodDoc) {
		this.methodDoc = methodDoc;
	}
}
