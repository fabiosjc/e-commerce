export MAVEN_OPTS="-Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"
java $JAVA_OPTS -jar e-commerce-web/target/dependency/webapp-runner.jar e-commerce-web/target/*.war
