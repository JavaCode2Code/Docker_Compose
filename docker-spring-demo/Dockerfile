FROM eclipse-temurin:17-jdk
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/spring-boot-docker-0.0.4-SNAPSHOT.jar spring-boot-docker-0.0.4-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-0.0.4-SNAPSHOT.jar"]