# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre
RUN mkdir /app
COPY build/libs/*.jar /app/spring-boot-application.jar
ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]