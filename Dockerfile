FROM openjdk:17-jdk-slim

WORKDIR /app
COPY . /app

COPY /app/build/libs/kingen-0.0.1-SNAPSHOT.jar /app/kingen.jar
COPY /app/gateway/build/libs/kingen-0.0.1-SNAPSHOT.jar /app/rabbit.jar
COPY /app/rabbit/build/libs/kingen-0.0.1-SNAPSHOT.jar /app/rabbit.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
