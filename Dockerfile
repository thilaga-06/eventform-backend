# Use JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Install Maven
RUN apk add --no-cache maven

# Copy all project files
COPY . .

# Build the JAR inside the container
RUN mvn clean package -DskipTests

# Run the generated JAR directly (no extra copy needed)
ENTRYPOINT ["java","-jar","target/demo-0.0.1-SNAPSHOT.jar"]
