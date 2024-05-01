FROM openjdk:17-jdk-slim

COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle .
COPY src src

RUN chmod +x gradlew
RUN ./gradlew build -x test

COPY ./build/libs/kingen-0.0.1-SNAPSHOT.jar /app/kingen.jar
COPY ./gateway/build/libs/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar
COPY ./rabbit/build/libs/rabbit-0.0.1-SNAPSHOT.jar /app/rabbit.jar

CMD ["java", "-jar", "kingen.jar"]
CMD ["java", "-jar", "rabbit.jar"]
ENTRYPOINT ["java", "-jar", "gateway.jar"]
