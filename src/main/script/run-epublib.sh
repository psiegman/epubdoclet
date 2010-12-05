PROJECT_HOME=/home/paul/project/private/epublib/workspaces/ws1/epublib

JAVA_HOME=/home/paul/opt/jdk
M2_REPO=/home/paul/.m2/repository
EPUBLIB_HOME=/home/paul/project/private/epublib/epublib
EPUBLIB_JAR=${EPUBLIB_HOME}/target/epublib-2.0-SNAPSHOT-complete.jar
EPUBDOCLET_HOME=/home/paul/project/private/epublib/workspaces/ws1/epubdoclet
TARGET_DIR=${EPUBDOCLET_HOME}/target
SOURCE_PATH=${EPUBLIB_HOME}/src/main/java

DOCLET_PATH=${TARGET_DIR}/classes:${M2_REPO}/org/apache/velocity/velocity/1.7/velocity-1.7.jar:${JAVA_HOME}/lib/tools.jar:${M2_REPO}/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:${M2_REPO}/commons-lang/commons-lang/2.4/commons-lang-2.4.jar:${EPUBLIB_JAR}

echo javadoc -doclet nl.siegmann.epubdoclet.EpubDoclet -classpath ${DOCLET_PATH} -docletpath ${DOCLET_PATH} -sourcepath ${SOURCE_PATH} -subpackages nl
javadoc -doclet nl.siegmann.epubdoclet.EpubDoclet -classpath ${DOCLET_PATH} -docletpath ${DOCLET_PATH} -sourcepath ${SOURCE_PATH} -subpackages nl
