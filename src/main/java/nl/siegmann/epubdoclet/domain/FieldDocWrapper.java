package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.SerialFieldTag;
import com.sun.javadoc.Type;

public class FieldDocWrapper extends MemberDocWrapper implements FieldDoc {
	
	protected FieldDoc fieldDoc;

	public FieldDocWrapper(FieldDoc fieldDoc) {
		super(fieldDoc);
		this.fieldDoc = fieldDoc;
	}
	
	@Override
	public Type type() {
		return fieldDoc.type();
	}

	@Override
	public boolean isTransient() {
		return fieldDoc.isTransient();
	}

	@Override
	public boolean isVolatile() {
		return fieldDoc.isVolatile();
	}

	@Override
	public SerialFieldTag[] serialFieldTags() {
		return fieldDoc.serialFieldTags();
	}

	@Override
	public Object constantValue() {
		return fieldDoc.constantValue();
	}

	@Override
	public String constantValueExpression() {
		return fieldDoc.constantValueExpression();
	}
}
