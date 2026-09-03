# Use Java 21 base image
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Install Maven
RUN apk add --no-cache maven

# Copy all project files
COPY . .

# Build the JAR inside the container
RUN mvn clean package -DskipTests

# Run the generated JAR
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
