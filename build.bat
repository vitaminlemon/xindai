javac -d WebRoot\WEB-INF\classes -cp WebRoot\WEB-INF\lib\ojdbc14.jar   src\com\credit\customer\lrfpb\models\*.java    

javac -d WebRoot\WEB-INF\classes -classpath WebRoot\WEB-INF\lib\servlet-api.jar;WebRoot\WEB-INF\classes                  src\com\credit\customer\lrfpb\controllers\*.java   

javac -d WebRoot\WEB-INF\classes -cp WebRoot\WEB-INF\lib\ojdbc14.jar   src\com\credit\customer\sdkhxx\models\*.java   

javac -d WebRoot\WEB-INF\classes -classpath WebRoot\WEB-INF\lib\servlet-api.jar;WebRoot\WEB-INF\classes                  src\com\credit\customer\sdkhxx\controllers\*.java 


javac -d WebRoot\WEB-INF\classes -cp WebRoot\WEB-INF\lib\ojdbc14.jar   src\com\credit\customer\xjllb\models\*.java   

javac -d WebRoot\WEB-INF\classes -classpath WebRoot\WEB-INF\lib\servlet-api.jar;WebRoot\WEB-INF\classes                  src\com\credit\customer\xjllb\controllers\*.java 


javac -d WebRoot\WEB-INF\classes -cp WebRoot\WEB-INF\lib\ojdbc14.jar src\com\credit\customer\xiaoguimonashuiren\models\*.java

javac -d WebRoot\WEB-INF\classes -classpath WebRoot\WEB-INF\lib\servlet-api.jar;WebRoot\WEB-INF\classes src\com\credit\customer\xiaoguimonashuiren\controllers\*.java

javac -d WebRoot\WEB-INF\classes -cp WebRoot\WEB-INF\lib\ojdbc14.jar   src\com\credit\customer\khrcqk\models\*.java
javac -d WebRoot\WEB-INF\classes -classpath WebRoot\WEB-INF\lib\servlet-api.jar;WebRoot\WEB-INF\classes   src\com\credit\customer\khrcqk\controllers\*.java

javac -d WebRoot\WEB-INF\classes -cp WebRoot\WEB-INF\lib\ojdbc14.jar   src\com\credit\customer\Syb\models\*.java
javac -d WebRoot\WEB-INF\classes -classpath WebRoot\WEB-INF\lib\servlet-api.jar;WebRoot\WEB-INF\classes   src\com\credit\customer\Syb\controllers\*.java


xcopy /E /Y WebRoot\*.* E:\tomcat6\webapps\credit 

E:\tomcat6\bin\startup.bat   