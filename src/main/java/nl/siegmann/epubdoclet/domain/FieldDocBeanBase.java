package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.SerialFieldTag;
import com.sun.javadoc.Type;

public class FieldDocBeanBase extends FieldDocWrapper implements FieldDoc {

	public FieldDocBeanBase(FieldDoc fieldDoc) {
		super(fieldDoc);
	}
	
	public Type getType() {
		return fieldDoc.type();
	}

	public SerialFieldTag[] getSerialFieldTags() {
		return fieldDoc.serialFieldTags();
	}


	public Object getConstantValue() {
		return fieldDoc.constantValue();
	}

	public String getConstantValueExpression() {
		return fieldDoc.constantValueExpression();
	}

}
