FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Install bash and Maven dependencies
RUN apk add --no-cache bash
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw
RUN ./mvnw dependency:resolve
COPY src ./src
RUN ./mvnw clean package -DskipTests
COPY target/eventform-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
