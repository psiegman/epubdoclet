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

public class MethodDocBeanBase extends MethodDocWrapper {

	public MethodDocBeanBase(MethodDoc methodDoc) {
		super(methodDoc);
	}
	
	
	public AnnotationDesc[] getAnnotations() {
		return methodDoc.annotations();
	}

	public String getCommentText() {
		return methodDoc.commentText();
	}

	public int compareTo(Object arg0) {
		return methodDoc.compareTo(arg0);
	}

	public ClassDoc getContainingClass() {
		return methodDoc.containingClass();
	}

	public PackageDoc getContainingPackage() {
		return methodDoc.containingPackage();
	}

	public Tag[] getFirstSentenceTags() {
		return methodDoc.firstSentenceTags();
	}

	public String getFlatSignature() {
		return methodDoc.flatSignature();
	}

	public String getRawCommentText() {
		return methodDoc.getRawCommentText();
	}

	public Tag[] getInlineTags() {
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

	public int getModifierSpecifier() {
		return methodDoc.modifierSpecifier();
	}

	public String getModifiers() {
		return methodDoc.modifiers();
	}

	public String getName() {
		return methodDoc.name();
	}

	public ClassDoc getOverriddenClass() {
		return methodDoc.overriddenClass();
	}

	public MethodDoc getOverriddenMethod() {
		return methodDoc.overriddenMethod();
	}

	public Type getOverriddenType() {
		return methodDoc.overriddenType();
	}

	public boolean getOverrides(MethodDoc arg0) {
		return methodDoc.overrides(arg0);
	}

	public ParamTag[] getParamTags() {
		return methodDoc.paramTags();
	}

	public Parameter[] getParameters() {
		return methodDoc.parameters();
	}

	public SourcePosition getPosition() {
		return methodDoc.position();
	}

	public String getQualifiedName() {
		return methodDoc.qualifiedName();
	}

	public Type getReturnType() {
		return methodDoc.returnType();
	}

	public SeeTag[] getSeeTags() {
		return methodDoc.seeTags();
	}

	public void setRawCommentText(String arg0) {
		methodDoc.setRawCommentText(arg0);
	}

	public String getSignature() {
		return methodDoc.signature();
	}

	public Tag[] getTags() {
		return methodDoc.tags();
	}

	public Tag[] getTags(String arg0) {
		return methodDoc.tags(arg0);
	}

	public Type[] thrownExceptionTypes() {
		return methodDoc.thrownExceptionTypes();
	}

	public ClassDoc[] getThrownExceptions() {
		return methodDoc.thrownExceptions();
	}

	public ThrowsTag[] getThrowsTags() {
		return methodDoc.throwsTags();
	}

	public ParamTag[] getTypeParamTags() {
		return methodDoc.typeParamTags();
	}

	public TypeVariable[] getTypeParameters() {
		return methodDoc.typeParameters();
	}
	
}
