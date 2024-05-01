FROM openjdk:17-jdk-slim

WORKDIR /app
COPY . /app

COPY /app/build/libs/kingen-0.0.1-SNAPSHOT.jar /app/kingen.jar
COPY /app/gateway/build/libs/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar
COPY /app/rabbit/build/libs/rabbit-0.0.1-SNAPSHOT.jar /app/rabbit.jar

CMD ["java", "-jar", "kingen.jar"]
CMD ["java", "-jar", "gateway.jar"]
ENTRYPOINT ["java", "-jar", "rabbit.jar"]
