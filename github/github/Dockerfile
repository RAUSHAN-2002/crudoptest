FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar and keep the same name
COPY target/github-0.0.1-SNAPSHOT.jar github.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "github.jar"]
