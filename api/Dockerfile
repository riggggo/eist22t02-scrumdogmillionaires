FROM openjdk:17-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring


#RUN ./gradlew build
ARG JAR_FILE=build/libs/api-1.0.0.jar

COPY ${JAR_FILE} app.jar

USER root
RUN mkdir -p api/src/main/java/data/
COPY api/src/main/java/data/email.json api/src/main/java/data/email.json
COPY api/src/main/java/data/restaurants.json api/src/main/java/data/restaurants.json
COPY api/src/main/java/data/reservation_id.json api/src/main/java/data/reservation_id.json
RUN chmod 777 api/src/main/java/data/*
RUN chown spring:spring /api/src

USER spring:spring

ENTRYPOINT ["java","-jar","/app.jar"]
