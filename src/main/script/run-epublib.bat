rem variables describing the code we want to document
set EPUBLIB_HOME=C:\Docume~1\paul~1.sie\MYDOCU~1\private\epublib\epublib
set SOURCE_PATH=%EPUBLIB_HOME%\src\main\java
set CLASSPATH=%EPUBLIB_HOME%\target\epublib-2.0-SNAPSHOT-complete.jar

rem the classpath where the epubdoclet resides in
set EPUBDOCLET_PATH=C:\Docume~1\paul~1.sie\MYDOCU~1\private\epubdoclet\epubdoclet\target\epubdoclet-2.0-SNAPSHOT-complete.jar

javadoc -doclet nl.siegmann.epubdoclet.EpubDoclet -classpath %CLASSPATH% -docletpath %DOCLET_PATH% -sourcepath %SOURCE_PATH% -subpackages nl
