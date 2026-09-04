FROM eclipse-temurin:17
LABEL maintainer="dummymvn@gmail.com"
EXPOSE 8080
COPY target/dockerSpringBoot-1.0-SNAPSHOT.jar dockerSpringBoot-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/dockerSpringBoot-1.0-SNAPSHOT.jar"]