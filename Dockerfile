FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Install Maven
RUN apk add --no-cache bash maven

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Use the actual jar name from target folder
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
