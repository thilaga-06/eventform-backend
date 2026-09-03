FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
RUN apk add --no-cache maven
COPY . .
RUN mvn clean package -DskipTests
ENTRYPOINT ["java","-jar","target/demo-0.0.1-SNAPSHOT.jar"]
