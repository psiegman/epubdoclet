package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.Doc;
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.SourcePosition;
import com.sun.javadoc.Tag;

public class DocBeanBase extends DocWrapper {

	public DocBeanBase(Doc doc) {
		super(doc);
	}
	
	public String getCommentText() {
		return doc.commentText();
	}
	public Tag[] getTags() {
		return doc.tags();
	}
	public Tag[] setTags(String paramString) {
		return doc.tags(paramString);
	}
	public SeeTag[] getSeeTags() {
		return doc.seeTags();
	}
	public Tag[] getInlineTags() {
		return doc.inlineTags();
	}
	public Tag[] getFirstSentenceTags() {
		return doc.firstSentenceTags();
	}

	public String getName() {
		return doc.name();
	}

	public SourcePosition getPosition() {
		return doc.position();
	}
}
