FROM maven:3.8.7-openjdk-17-slim AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-alpine

WORKDIR /app

COPY --from=build /app/target/weather_service-0.0.1-SNAPSHOT.jar /app/weather_service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/weather_service.jar"]