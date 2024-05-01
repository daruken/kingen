FROM openjdk:17-jdk-slim

WORKDIR /app
COPY . /app

RUN ./gradlew build -x test

COPY build/libs/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
