package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.MemberDoc;

public class MemberDocWrapper extends ProgramElementDocBean implements MemberDoc {

	protected MemberDoc memberDoc;

	public MemberDocWrapper(MemberDoc memberDoc) {
		super(memberDoc);
		this.memberDoc = memberDoc;
	}

	@Override
	public boolean isSynthetic() {
		return memberDoc.isSynthetic();
	}
}
