package nl.siegmann.epubdoclet.domain;

import com.sun.javadoc.AnnotationTypeDoc;
import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.ConstructorDoc;
import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.PackageDoc;
import com.sun.javadoc.ParamTag;
import com.sun.javadoc.ParameterizedType;
import com.sun.javadoc.Type;
import com.sun.javadoc.TypeVariable;
import com.sun.javadoc.WildcardType;

public class ClassDocWrapper extends ProgramElementDocBean implements ClassDoc {
	protected ClassDoc classDoc;

	public ClassDocWrapper(ClassDoc classDoc) {
		super(classDoc);
		this.classDoc = classDoc;
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

	public ConstructorDoc[] constructors() {
		return classDoc.constructors();
	}

	public ConstructorDoc[] constructors(boolean arg0) {
		return classDoc.constructors(arg0);
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

	public ClassDoc[] importedClasses() {
		return classDoc.importedClasses();
	}

	public PackageDoc[] importedPackages() {
		return classDoc.importedPackages();
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

	public boolean isExternalizable() {
		return classDoc.isExternalizable();
	}


	public boolean isPrimitive() {
		return classDoc.isPrimitive();
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

	public String qualifiedTypeName() {
		return classDoc.qualifiedTypeName();
	}

	public FieldDoc[] serializableFields() {
		return classDoc.serializableFields();
	}

	public MethodDoc[] serializationMethods() {
		return classDoc.serializationMethods();
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
