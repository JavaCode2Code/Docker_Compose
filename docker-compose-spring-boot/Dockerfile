FROM eclipse-temurin:17-jdk
LABEL maintainer="dummymvn@gmail.com"
EXPOSE 8080
COPY target/docker-spring-boot-jpa-0.0.1-SNAPSHOT.jar docker-spring-boot-jpa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-spring-boot-jpa-0.0.1-SNAPSHOT.jar"]