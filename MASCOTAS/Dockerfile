FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY MASCOTAS /app

RUN mvn -f MASCOTAS/pom.xml clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "MASCOTAS/target/*.jar"]