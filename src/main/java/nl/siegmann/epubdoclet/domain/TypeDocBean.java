package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.Type;

public class TypeDocBean {
	private Type type;

	public TypeDocBean(Type type) {
		super();
		this.type = type;
	}
	
	public String getFullName() {
		return type.qualifiedTypeName();
	}
}
