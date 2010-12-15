package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.AnnotationDesc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.PackageDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.Parameter;
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.SourcePosition;
import com.sun.javadoc.Tag;
import com.sun.javadoc.ThrowsTag;
import com.sun.javadoc.Type;
import com.sun.javadoc.TypeVariable;

public class MethodDocWrapper extends ProgramElementDocBean implements MethodDoc {

	protected MethodDoc methodDoc;

	public MethodDocWrapper(MethodDoc methodDoc) {
		super(methodDoc);
		this.methodDoc = methodDoc;
	}
	
	public AnnotationDesc[] annotations() {
		return methodDoc.annotations();
	}

	public String commentText() {
		return methodDoc.commentText();
	}

	public int compareTo(Object arg0) {
		return methodDoc.compareTo(arg0);
	}

	public ClassDoc containingClass() {
		return methodDoc.containingClass();
	}

	public PackageDoc containingPackage() {
		return methodDoc.containingPackage();
	}

	public Tag[] firstSentenceTags() {
		return methodDoc.firstSentenceTags();
	}

	public String flatSignature() {
		return methodDoc.flatSignature();
	}

	public String getRawCommentText() {
		return methodDoc.getRawCommentText();
	}

	public Tag[] inlineTags() {
		return methodDoc.inlineTags();
	}

	public boolean isAbstract() {
		return methodDoc.isAbstract();
	}

	public boolean isAnnotationType() {
		return methodDoc.isAnnotationType();
	}

	public boolean isAnnotationTypeElement() {
		return methodDoc.isAnnotationTypeElement();
	}

	public boolean isClass() {
		return methodDoc.isClass();
	}

	public boolean isConstructor() {
		return methodDoc.isConstructor();
	}

	public boolean isEnum() {
		return methodDoc.isEnum();
	}

	public boolean isEnumConstant() {
		return methodDoc.isEnumConstant();
	}

	public boolean isError() {
		return methodDoc.isError();
	}

	public boolean isException() {
		return methodDoc.isException();
	}

	public boolean isField() {
		return methodDoc.isField();
	}

	public boolean isFinal() {
		return methodDoc.isFinal();
	}

	public boolean isIncluded() {
		return methodDoc.isIncluded();
	}

	public boolean isInterface() {
		return methodDoc.isInterface();
	}

	public boolean isMethod() {
		return methodDoc.isMethod();
	}

	public boolean isNative() {
		return methodDoc.isNative();
	}

	public boolean isOrdinaryClass() {
		return methodDoc.isOrdinaryClass();
	}

	public boolean isPackagePrivate() {
		return methodDoc.isPackagePrivate();
	}

	public boolean isPrivate() {
		return methodDoc.isPrivate();
	}

	public boolean isProtected() {
		return methodDoc.isProtected();
	}

	public boolean isPublic() {
		return methodDoc.isPublic();
	}

	public boolean isStatic() {
		return methodDoc.isStatic();
	}

	public boolean isSynchronized() {
		return methodDoc.isSynchronized();
	}

	public boolean isSynthetic() {
		return methodDoc.isSynthetic();
	}

	public boolean isVarArgs() {
		return methodDoc.isVarArgs();
	}

	public int modifierSpecifier() {
		return methodDoc.modifierSpecifier();
	}

	public String modifiers() {
		return methodDoc.modifiers();
	}

	public String name() {
		return methodDoc.name();
	}

	public ClassDoc overriddenClass() {
		return methodDoc.overriddenClass();
	}

	public MethodDoc overriddenMethod() {
		return methodDoc.overriddenMethod();
	}

	public Type overriddenType() {
		return methodDoc.overriddenType();
	}

	public boolean overrides(MethodDoc arg0) {
		return methodDoc.overrides(arg0);
	}

	public ParamTag[] paramTags() {
		return methodDoc.paramTags();
	}

	public Parameter[] parameters() {
		return methodDoc.parameters();
	}

	public SourcePosition position() {
		return methodDoc.position();
	}

	public String qualifiedName() {
		return methodDoc.qualifiedName();
	}

	public Type returnType() {
		return methodDoc.returnType();
	}

	public SeeTag[] seeTags() {
		return methodDoc.seeTags();
	}

	public void setRawCommentText(String arg0) {
		methodDoc.setRawCommentText(arg0);
	}

	public String signature() {
		return methodDoc.signature();
	}

	public Tag[] tags() {
		return methodDoc.tags();
	}

	public Tag[] tags(String arg0) {
		return methodDoc.tags(arg0);
	}

	public Type[] thrownExceptionTypes() {
		return methodDoc.thrownExceptionTypes();
	}

	public ClassDoc[] thrownExceptions() {
		return methodDoc.thrownExceptions();
	}

	public ThrowsTag[] throwsTags() {
		return methodDoc.throwsTags();
	}

	public ParamTag[] typeParamTags() {
		return methodDoc.typeParamTags();
	}

	public TypeVariable[] typeParameters() {
		return methodDoc.typeParameters();
	}
	
}
