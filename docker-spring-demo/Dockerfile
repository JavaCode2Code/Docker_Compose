FROM eclipse-temurin:17
LABEL maintainer="dummymvn@gmail.com"
EXPOSE 8080
COPY target/docker-spring-demo-0.0.1-SNAPSHOT.jar docker-spring-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-spring-demo-0.0.1-SNAPSHOT.jar"]