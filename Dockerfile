# Use official lightweight Java 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy all project files
COPY . .

# Make the Gradle wrapper executable
RUN chmod +x ./gradlew

# Build the application (skip tests)
RUN ./gradlew build -x test

# Expose the port (default Spring Boot port)
EXPOSE 8080

# Run the JAR (replace with your actual JAR name if it changes)
CMD ["java", "-jar", "build/libs/chat-0.0.1-SNAPSHOT.jar"]
