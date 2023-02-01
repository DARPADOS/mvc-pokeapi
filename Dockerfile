FROM maven:3.8.7-eclipse-temurin-17-alpine as builder

ADD ./pom.xml pom.xml
ADD ./src src/

RUN mvn package

FROM openjdk:17-alpine

WORKDIR /app

COPY --from=builder target/poke-app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]