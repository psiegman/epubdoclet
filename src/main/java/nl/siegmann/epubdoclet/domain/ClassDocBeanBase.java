package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.AnnotationDesc;
import com.sun.javadoc.AnnotationTypeDoc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.ConstructorDoc;
import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.PackageDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.ParameterizedType;
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.SourcePosition;
import com.sun.javadoc.Tag;
import com.sun.javadoc.Type;
import com.sun.javadoc.TypeVariable;
import com.sun.javadoc.WildcardType;

public class ClassDocBeanBase extends ClassDocWrapper {

	public ClassDocBeanBase(ClassDoc classDoc) {
		super(classDoc);
	}

	public AnnotationDesc[] getAnnotations() {
		return classDoc.annotations();
	}

	public AnnotationTypeDoc getAsAnnotationTypeDoc() {
		return classDoc.asAnnotationTypeDoc();
	}

	public ClassDoc getAsClassDoc() {
		return classDoc.asClassDoc();
	}

	public ParameterizedType getAsParameterizedType() {
		return classDoc.asParameterizedType();
	}

	public TypeVariable getAsTypeVariable() {
		return classDoc.asTypeVariable();
	}

	public WildcardType getAsWildcardType() {
		return classDoc.asWildcardType();
	}

	public String getCommentText() {
		return classDoc.commentText();
	}

	public int compareTo(Object arg0) {
		return classDoc.compareTo(arg0);
	}

	public ConstructorDoc[] getConstructors() {
		return classDoc.constructors();
	}

	public ConstructorDoc[] getConstructors(boolean arg0) {
		return classDoc.constructors(arg0);
	}

	public ClassDoc getContainingClass() {
		return classDoc.containingClass();
	}

	public PackageDoc getContainingPackage() {
		return classDoc.containingPackage();
	}

	public boolean isDefinesSerializableFields() {
		return classDoc.definesSerializableFields();
	}

	public String getDimension() {
		return classDoc.dimension();
	}

	public FieldDoc[] getEnumConstants() {
		return classDoc.enumConstants();
	}

	public FieldDoc[] getFields() {
		return classDoc.fields();
	}

	public FieldDoc[] getFields(boolean arg0) {
		return classDoc.fields(arg0);
	}

	public ClassDoc findClass(String arg0) {
		return classDoc.findClass(arg0);
	}

	public Tag[] getFirstSentenceTags() {
		return classDoc.firstSentenceTags();
	}

	public String getRawCommentText() {
		return classDoc.getRawCommentText();
	}

	public ClassDoc[] getImportedClasses() {
		return classDoc.importedClasses();
	}

	public PackageDoc[] getImportedPackages() {
		return classDoc.importedPackages();
	}

	public Tag[] getInlineTags() {
		return classDoc.inlineTags();
	}

	public ClassDoc[] getInnerClasses() {
		return classDoc.innerClasses();
	}

	public ClassDoc[] getInnerClasses(boolean arg0) {
		return classDoc.innerClasses(arg0);
	}

	public Type[] getInterfaceTypes() {
		return classDoc.interfaceTypes();
	}

	public ClassDoc[] getInterfaces() {
		return classDoc.interfaces();
	}

	public boolean isAbstract() {
		return classDoc.isAbstract();
	}

	public boolean isAnnotationType() {
		return classDoc.isAnnotationType();
	}

	public boolean isAnnotationTypeElement() {
		return classDoc.isAnnotationTypeElement();
	}

	public boolean isClass() {
		return classDoc.isClass();
	}

	public boolean isConstructor() {
		return classDoc.isConstructor();
	}

	public boolean isEnum() {
		return classDoc.isEnum();
	}

	public boolean isEnumConstant() {
		return classDoc.isEnumConstant();
	}

	public boolean isError() {
		return classDoc.isError();
	}

	public boolean isException() {
		return classDoc.isException();
	}

	public boolean isExternalizable() {
		return classDoc.isExternalizable();
	}

	public boolean isField() {
		return classDoc.isField();
	}

	public boolean isFinal() {
		return classDoc.isFinal();
	}

	public boolean isIncluded() {
		return classDoc.isIncluded();
	}

	public boolean isInterface() {
		return classDoc.isInterface();
	}

	public boolean isMethod() {
		return classDoc.isMethod();
	}

	public boolean isOrdinaryClass() {
		return classDoc.isOrdinaryClass();
	}

	public boolean isPackagePrivate() {
		return classDoc.isPackagePrivate();
	}

	public boolean isPrimitive() {
		return classDoc.isPrimitive();
	}

	public boolean isPrivate() {
		return classDoc.isPrivate();
	}

	public boolean isProtected() {
		return classDoc.isProtected();
	}

	public boolean isPublic() {
		return classDoc.isPublic();
	}

	public boolean isSerializable() {
		return classDoc.isSerializable();
	}

	public boolean isStatic() {
		return classDoc.isStatic();
	}

	public MethodDoc[] getMethods() {
		return classDoc.methods();
	}

	public MethodDoc[] getMethods(boolean arg0) {
		return classDoc.methods(arg0);
	}

	public int getModifierSpecifier() {
		return classDoc.modifierSpecifier();
	}

	public String getModifiers() {
		return classDoc.modifiers();
	}

	public String getName() {
		return classDoc.name();
	}

	public SourcePosition getPosition() {
		return classDoc.position();
	}

	public String getQualifiedName() {
		return classDoc.qualifiedName();
	}

	public String getQualifiedTypeName() {
		return classDoc.qualifiedTypeName();
	}

	public SeeTag[] getSeeTags() {
		return classDoc.seeTags();
	}

	public FieldDoc[] getSerializableFields() {
		return classDoc.serializableFields();
	}

	public MethodDoc[] getSerializationMethods() {
		return classDoc.serializationMethods();
	}

	public void setRawCommentText(String arg0) {
		classDoc.setRawCommentText(arg0);
	}

	public String getSimpleTypeName() {
		return classDoc.simpleTypeName();
	}

	public boolean isSubclassOf(ClassDoc arg0) {
		return classDoc.subclassOf(arg0);
	}

	public ClassDoc getSuperclass() {
		return classDoc.superclass();
	}

	public Type getSuperclassType() {
		return classDoc.superclassType();
	}

	public Tag[] getTags() {
		return classDoc.tags();
	}

	public Tag[] getTags(String arg0) {
		return classDoc.tags(arg0);
	}

	public String toString() {
		return classDoc.toString();
	}

	public String typeName() {
		return classDoc.typeName();
	}

	public ParamTag[] getTypeParamTags() {
		return classDoc.typeParamTags();
	}

	public TypeVariable[] getTypeParameters() {
		return classDoc.typeParameters();
	}
}
