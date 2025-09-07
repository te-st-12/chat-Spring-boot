# Use official lightweight Java 17 runtime
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy everything into the container
COPY . .

# Build the application inside the container
RUN ./gradlew build -x test

# Expose the port your Spring Boot app runs on (default: 8080)
EXPOSE 8080

# Run the built JAR file
CMD ["java", "-jar", "build/libs/chat-0.0.1-SNAPSHOT.jar"]
