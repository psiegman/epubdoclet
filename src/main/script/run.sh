PROJECT_HOME=/home/paul/project/private/epublib/workspaces/ws1/epubdoclet

JAVA_HOME=/home/paul/opt/jdk
M2_REPO=/home/paul/.m2/repository
EPUBLIB_HOME=/home/paul/project/private/epublib/epublib
EPUBLIB_JAR=${EPUBLIB_HOME}/target/epublib-2.0-SNAPSHOT-complete.jar
TARGET_DIR=${PROJECT_HOME}/target
SOURCE_PATH=${PROJECT_HOME}/src/main/java

DOCLET_PATH=${TARGET_DIR}/classes:${M2_REPO}/org/apache/velocity/velocity/1.7/velocity-1.7.jar:${JAVA_HOME}/lib/tools.jar:${M2_REPO}/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:${M2_REPO}/commons-lang/commons-lang/2.4/commons-lang-2.4.jar:${EPUBLIB_JAR}

#-sourcepath ../../src/main/java -subpackages nl
#javadoc -classpath target/classes:/home/paul/.m2/repository/org/apache/velocity/velocity/ocity-1.7.jar:/home/paul/opt/jdk-1.6.20/lib/tools.jar -doclet nl.siegmann.epubdoclet.EpubDoclet -docletpath target/classes/:/home/paul/.m2/repository/org/apache/velocity/velocity/1.7/velocity-1.7.jar:/home/paul/opt/jdk-1.6.20/lib/tools.jar:/home/paul/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:/home/paul/.m2/repository/commons-lang/commons-lang/2.4/commons-lang-2.4.jar -sourcepath ../../src/main/java -subpackages nl

echo javadoc -classpath ${DOCLET_PATH} -doclet nl.siegmann.epubdoclet.EpubDoclet -docletpath ${DOCLET_PATH} -sourcepath ${SOURCE_PATH} -subpackages nl
javadoc -doclet nl.siegmann.epubdoclet.EpubDoclet -classpath ${DOCLET_PATH} -docletpath ${DOCLET_PATH} -sourcepath ${SOURCE_PATH} -subpackages nl
