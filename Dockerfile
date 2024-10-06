FROM openjdk:17-alpine

WORKDIR /app

COPY target/weather_service-0.0.1-SNAPSHOT.jar /app/weather_service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/weather_service.jar"]
