package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.AnnotationDesc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.PackageDoc;
import com.sun.javadoc.ProgramElementDoc;

public class ProgramElementDocBeanBase extends ProgramElementDocWrapper {

	public ProgramElementDocBeanBase(ProgramElementDoc programElementDoc) {
		super(programElementDoc);
	}

	public ClassDoc getContainingClass() {
		return programElementDoc.containingClass();
	}

	public PackageDoc getContainingPackage() {
		return programElementDoc.containingPackage();
	}

	public String getQualifiedName() {
		return programElementDoc.qualifiedName();
	}

	public int getModifierSpecifier() {
		return programElementDoc.modifierSpecifier();
	}

	public String getModifiers() {
		return programElementDoc.modifiers();
	}

	public AnnotationDesc[] getAnnotations() {
		return programElementDoc.annotations();
	}
}
