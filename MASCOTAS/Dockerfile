FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

COPY MASCOTAS /app

RUN mvn clean package -DskipTests
./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]