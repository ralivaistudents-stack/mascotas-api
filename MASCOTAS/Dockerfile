FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN mvn -f MASCOTAS/MASCOTAS/pom.xml clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "MASCOTAS/MASCOTAS/target/*.jar"]