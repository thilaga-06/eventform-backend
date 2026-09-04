FROM openjdk:26
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests
CMD ["./mvnw","spring-boot:run"]
