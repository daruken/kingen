FROM openjdk:17-jdk-slim AS builder

COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle.kts build.gradle.kts
COPY settings.gradle settings.gradle
COPY src src

RUN chmod +x ./gradlew
RUN ./gradlew clean build

FROM openjdk:17-jdk-slim
COPY --from=builder build/libs/rabbit-0.0.1-SNAPSHOT.jar rabbit.jar

EXPOSE 18080

ENTRYPOINT ["java", "-jar", "rabbit.jar"]
