package nl.siegmann.epubdoclet.domain;

import org.apache.commons.lang.StringUtils;

import com.sun.javadoc.Doc;

public class DocBean extends DocBeanBase {

	public DocBean(Doc doc) {
		super(doc);
	}
	

	public String getCommentFirstLine() {
		String result = StringUtils.substringBefore(getCommentText(), ".");
		if (StringUtils.isNotBlank(result)) {
			result += ".";
		}
		return result;
	}
}
