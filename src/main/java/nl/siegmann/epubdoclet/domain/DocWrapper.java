package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.Doc;
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.SourcePosition;
import com.sun.javadoc.Tag;

public class DocWrapper implements Doc {
	
	protected Doc doc;

	public DocWrapper(Doc doc) {
		this.doc = doc;
	}
	
	public String commentText() {
		return doc.commentText();
	}

	public Tag[] tags() {
		return doc.tags();
	}

	public Tag[] tags(String paramString) {
		return doc.tags(paramString);
	}

	public SeeTag[] seeTags() {
		return doc.seeTags();
	}

	public Tag[] inlineTags() {
		return doc.inlineTags();
	}

	public Tag[] firstSentenceTags() {
		return doc.firstSentenceTags();
	}

	public String getRawCommentText() {
		return doc.getRawCommentText();
	}

	public void setRawCommentText(String paramString) {
		doc.setRawCommentText(paramString);
	}

	public String name() {
		return doc.name();
	}

	public int compareTo(Object paramObject) {
		return doc.compareTo(paramObject);
	}

	public boolean isField() {
		return doc.isField();
	}

	public boolean isEnumConstant() {
		return doc.isEnumConstant();
	}

	public boolean isConstructor() {
		return doc.isConstructor();
	}

	public boolean isMethod() {
		return doc.isMethod();
	}

	public boolean isAnnotationTypeElement() {
		return doc.isAnnotationTypeElement();
	}

	public boolean isInterface() {
		return doc.isInterface();
	}

	public boolean isException() {
		return doc.isException();
	}

	public boolean isError() {
		return doc.isError();
	}

	public boolean isEnum() {
		return doc.isEnum();
	}

	public boolean isAnnotationType() {
		return doc.isAnnotationType();
	}

	public boolean isOrdinaryClass() {
		return doc.isOrdinaryClass();
	}

	public boolean isClass() {
		return doc.isClass();
	}

	public boolean isIncluded() {
		return doc.isIncluded();
	}

	public SourcePosition position() {
		return doc.position();
	}

}
