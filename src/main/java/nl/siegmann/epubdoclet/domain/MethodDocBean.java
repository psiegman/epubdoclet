package nl.siegmann.epubdoclet.domain;

import org.apache.commons.lang.StringUtils;

import com.sun.javadoc.MethodDoc;

public class MethodDocBean extends MethodDocBeanBase {

	public MethodDocBean(MethodDoc methodDoc) {
		super(methodDoc);
	}


	public String getCommentFirstLine() {
		String result = StringUtils.substringBefore(getCommentText(), ".");
		if (StringUtils.isNotBlank(result)) {
			result += ".";
		}
		return result;
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
