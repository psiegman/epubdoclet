rem variables describing the code we want to document
set GRADLE_HOME=C:\Progra~1\gradle-0.9-rc-3\
set SOURCE_PATH=%GRADLE_HOME%\src\
set GRADLE_LIB=%GRADLE_HOME%\lib
set CLASSPATH=%GRADLE_LIB%\ant-1.8.1.jar;%GRADLE_LIB%\ant-launcher-1.8.1.jar;%GRADLE_LIB%\ant-nodeps-1.8.1.jar;%GRADLE_LIB%\asm-all-3.2.jar;%GRADLE_LIB%\commons-cli-1.2.jar;%GRADLE_LIB%\commons-codec-1.2.jar;%GRADLE_LIB%\commons-collections-3.2.1.jar;%GRADLE_LIB%\commons-httpclient-3.0.jar;%GRADLE_LIB%\commons-io-1.4.jar;%GRADLE_LIB%\commons-lang-2.5.jar;%GRADLE_LIB%\dom4j-1.6.1.jar;%GRADLE_LIB%\google-collections-1.0.jar;%GRADLE_LIB%\gradle-core-0.9-rc-3.jar;%GRADLE_LIB%\gradle-launcher-0.9-rc-3.jar;%GRADLE_LIB%\gradle-open-api-0.9-rc-3.jar;%GRADLE_LIB%\gradle-ui-0.9-rc-3.jar;%GRADLE_LIB%\groovy-all-1.7.5.jar;%GRADLE_LIB%\ivy-2.2.0.jar;%GRADLE_LIB%\jansi-1.2.1.jar;%GRADLE_LIB%\jaxen-1.1.jar;%GRADLE_LIB%\jcl-over-slf4j-1.6.1.jar;%GRADLE_LIB%\%GRADLE_LIB%\jna-3.2.2.jar;%GRADLE_LIB%\jna-posix-1.0.3.jar;%GRADLE_LIB%\jsch-0.1.42.jar;%GRADLE_LIB%\jul-to-slf4j-1.6.1.jar;%GRADLE_LIB%\jzlib-1.0.7.jar;%GRADLE_LIB%\log4j-over-slf4j-1.6.1.jar;%GRADLE_LIB%\logback-classic-0.9.24.jar;%GRADLE_LIB%\logback-core-0.9.24.jar;%GRADLE_LIB%\maven-ant-tasks-2.1.1.jar;%GRADLE_LIB%\plexus-component-annotations-1.5.2.jar;%GRADLE_LIB%\pmaven-common-0.8-20100325.jar;%GRADLE_LIB%\pmaven-groovy-0.8-20100325.jar;%GRADLE_LIB%\slf4j-api-1.6.1.jar;%GRADLE_LIB%\webdavlib-2.0.jar

rem the classpath where the epubdoclet resides in
set EPUBDOCLET_PATH=C:\Docume~1\paul~1.sie\MYDOCU~1\private\epubdoclet\epubdoclet\target\epubdoclet-2.0-SNAPSHOT-complete.jar

javadoc -doclet nl.siegmann.epubdoclet.EpubDoclet -classpath %CLASSPATH% -docletpath %DOCLET_PATH% -sourcepath %SOURCE_PATH% -subpackages org.gradle

