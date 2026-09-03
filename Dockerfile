FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Install Maven and bash
RUN apk add --no-cache bash maven

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

COPY target/eventform-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
