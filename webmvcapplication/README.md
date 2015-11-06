##### An example of simple web project

	created project using maven archetype 
_mvn archetype:generate -DgroupId=com.mahajan.learning -DartifactId=webmvcapplication -DarchetypeArtifactId=spring-mvc-archetype -DinteractiveMode=false_

Added Login/Singnup pages with a controller

To run follow below mentioned steps :

1. mvn clean install
2. mvn jetty:run -Djetty.port=9999 
3. enter _http://localhost:9999/webmvcapplication/_ url in browser