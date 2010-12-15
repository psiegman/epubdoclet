package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.FieldDoc;

public class FieldDocBean extends FieldDocBeanBase {

	public FieldDocBean(FieldDoc fieldDoc) {
		super(fieldDoc);
	}

	public String getFieldId() {
		return getName();
	}
}
