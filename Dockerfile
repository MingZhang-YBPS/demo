FROM os-harbor-svc.default.svc.cloudos:443/helm/h3ccloud/cicd/openjdk:8u191
ARG JAR_FILE=./*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]