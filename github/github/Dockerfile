# Use OpenJDK image
FROM openjdk:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the JAR file
COPY target/github.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
