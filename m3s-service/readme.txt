** Download Dependencies and Generation of the Eclipse configuration files

  $mvn -Dmaven.test.skip=true clean eclipse:clean eclipse:eclipse -DdownloadSources=true -DdownloadJavadocs=true



** Install de artifact in the repository    
  $mvn -Dmaven.test.skip=true clean install source:jar --offline
 
 -> its recommended to be run online because maven needs to download a couple of jars, 
 then you would be able to run the test without connection.    



** About eclipse problems with tr.jar
 In some version of Eclipse on Ubuntu (using java-sun) the IDE is unable to locate the jar file. This
 could be fixed setting the concrete path of the java jre as follow:
Go to java build path and edit the JRE library, selecting the workspace default JRE.


