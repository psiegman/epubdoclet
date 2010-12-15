package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.AnnotationTypeDoc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.ParameterizedType;
import com.sun.javadoc.Type;
import com.sun.javadoc.TypeVariable;
import com.sun.javadoc.WildcardType;

public class TypeWrapper implements Type {
	
	protected Type type;

	public TypeWrapper(Type type) {
		this.type = type;
	}
	
	public String typeName() {
		return type.typeName();
	}

	public String qualifiedTypeName() {
		return type.qualifiedTypeName();
	}

	public String simpleTypeName() {
		return type.simpleTypeName();
	}

	public String dimension() {
		return type.dimension();
	}

	public String toString() {
		return type.toString();
	}

	public boolean isPrimitive() {
		return type.isPrimitive();
	}

	public ClassDoc asClassDoc() {
		return type.asClassDoc();
	}

	public ParameterizedType asParameterizedType() {
		return type.asParameterizedType();
	}

	public TypeVariable asTypeVariable() {
		return type.asTypeVariable();
	}

	public WildcardType asWildcardType() {
		return type.asWildcardType();
	}

	public AnnotationTypeDoc asAnnotationTypeDoc() {
		return type.asAnnotationTypeDoc();
	}
}
