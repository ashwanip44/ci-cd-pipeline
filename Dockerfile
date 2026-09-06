FROM eclipse-temurin:21-jre

WORKDIR /demo

COPY target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","app.jar"]
