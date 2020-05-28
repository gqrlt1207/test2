FROM openjdk:8
EXPOSE 8080
ADD target/testApi.jar testDocker.jar
ENTRYPOINT ["java","-jar","/testDocker.jar"]