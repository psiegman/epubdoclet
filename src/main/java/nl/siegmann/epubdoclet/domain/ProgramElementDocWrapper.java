package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.AnnotationDesc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.PackageDoc;
import com.sun.javadoc.ProgramElementDoc;

public class ProgramElementDocWrapper extends DocBean implements ProgramElementDoc {
	
	protected ProgramElementDoc programElementDoc;

	
	public ProgramElementDocWrapper(ProgramElementDoc programElementDoc) {
		super(programElementDoc);
		this.programElementDoc = programElementDoc;
	}
	
	@Override
	public ClassDoc containingClass() {
		return programElementDoc.containingClass();
	}

	@Override
	public PackageDoc containingPackage() {
		return programElementDoc.containingPackage();
	}

	@Override
	public String qualifiedName() {
		return programElementDoc.qualifiedName();
	}

	@Override
	public int modifierSpecifier() {
		return programElementDoc.modifierSpecifier();
	}

	@Override
	public String modifiers() {
		return programElementDoc.modifiers();
	}

	@Override
	public AnnotationDesc[] annotations() {
		return programElementDoc.annotations();
	}

	@Override
	public boolean isPublic() {
		return programElementDoc.isPublic();
	}

	@Override
	public boolean isProtected() {
		return programElementDoc.isProtected();
	}

	@Override
	public boolean isPrivate() {
		return programElementDoc.isPrivate();
	}

	@Override
	public boolean isPackagePrivate() {
		return programElementDoc.isPackagePrivate();
	}

	@Override
	public boolean isStatic() {
		return programElementDoc.isStatic();
	}

	@Override
	public boolean isFinal() {
		return programElementDoc.isFinal();
	}
}
