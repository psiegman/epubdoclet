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

public class ClassDocWrapper implements ClassDoc {
	protected ClassDoc classDoc;

	public ClassDocWrapper(ClassDoc classDoc) {
		this.classDoc = classDoc;
	}

	public AnnotationDesc[] annotations() {
		return classDoc.annotations();
	}

	public AnnotationTypeDoc asAnnotationTypeDoc() {
		return classDoc.asAnnotationTypeDoc();
	}

	public ClassDoc asClassDoc() {
		return classDoc.asClassDoc();
	}

	public ParameterizedType asParameterizedType() {
		return classDoc.asParameterizedType();
	}

	public TypeVariable asTypeVariable() {
		return classDoc.asTypeVariable();
	}

	public WildcardType asWildcardType() {
		return classDoc.asWildcardType();
	}

	public String commentText() {
		return classDoc.commentText();
	}

	public int compareTo(Object arg0) {
		return classDoc.compareTo(arg0);
	}

	public ConstructorDoc[] constructors() {
		return classDoc.constructors();
	}

	public ConstructorDoc[] constructors(boolean arg0) {
		return classDoc.constructors(arg0);
	}

	public ClassDoc containingClass() {
		return classDoc.containingClass();
	}

	public PackageDoc containingPackage() {
		return classDoc.containingPackage();
	}

	public boolean definesSerializableFields() {
		return classDoc.definesSerializableFields();
	}

	public String dimension() {
		return classDoc.dimension();
	}

	public FieldDoc[] enumConstants() {
		return classDoc.enumConstants();
	}

	public FieldDoc[] fields() {
		return classDoc.fields();
	}

	public FieldDoc[] fields(boolean arg0) {
		return classDoc.fields(arg0);
	}

	public ClassDoc findClass(String arg0) {
		return classDoc.findClass(arg0);
	}

	public Tag[] firstSentenceTags() {
		return classDoc.firstSentenceTags();
	}

	public String getRawCommentText() {
		return classDoc.getRawCommentText();
	}

	public ClassDoc[] importedClasses() {
		return classDoc.importedClasses();
	}

	public PackageDoc[] importedPackages() {
		return classDoc.importedPackages();
	}

	public Tag[] inlineTags() {
		return classDoc.inlineTags();
	}

	public ClassDoc[] innerClasses() {
		return classDoc.innerClasses();
	}

	public ClassDoc[] innerClasses(boolean arg0) {
		return classDoc.innerClasses(arg0);
	}

	public Type[] interfaceTypes() {
		return classDoc.interfaceTypes();
	}

	public ClassDoc[] interfaces() {
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

	public MethodDoc[] methods() {
		return classDoc.methods();
	}

	public MethodDoc[] methods(boolean arg0) {
		return classDoc.methods(arg0);
	}

	public int modifierSpecifier() {
		return classDoc.modifierSpecifier();
	}

	public String modifiers() {
		return classDoc.modifiers();
	}

	public String name() {
		return classDoc.name();
	}

	public SourcePosition position() {
		return classDoc.position();
	}

	public String qualifiedName() {
		return classDoc.qualifiedName();
	}

	public String qualifiedTypeName() {
		return classDoc.qualifiedTypeName();
	}

	public SeeTag[] seeTags() {
		return classDoc.seeTags();
	}

	public FieldDoc[] serializableFields() {
		return classDoc.serializableFields();
	}

	public MethodDoc[] serializationMethods() {
		return classDoc.serializationMethods();
	}

	public void setRawCommentText(String arg0) {
		classDoc.setRawCommentText(arg0);
	}

	public String simpleTypeName() {
		return classDoc.simpleTypeName();
	}

	public boolean subclassOf(ClassDoc arg0) {
		return classDoc.subclassOf(arg0);
	}

	public ClassDoc superclass() {
		return classDoc.superclass();
	}

	public Type superclassType() {
		return classDoc.superclassType();
	}

	public Tag[] tags() {
		return classDoc.tags();
	}

	public Tag[] tags(String arg0) {
		return classDoc.tags(arg0);
	}

	public String toString() {
		return classDoc.toString();
	}

	public String typeName() {
		return classDoc.typeName();
	}

	public ParamTag[] typeParamTags() {
		return classDoc.typeParamTags();
	}

	public TypeVariable[] typeParameters() {
		return classDoc.typeParameters();
	}
}
