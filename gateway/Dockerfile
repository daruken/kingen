FROM openjdk:17-jdk-slim AS builder

COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle.kts build.gradle.kts
COPY settings.gradle settings.gradle
COPY src src

RUN chmod +x ./gradlew
RUN ./gradlew clean build

FROM openjdk:17-jdk-slim
COPY --from=builder build/libs/gateway-0.0.1-SNAPSHOT.jar gateway.jar

EXPOSE 28080

ENTRYPOINT ["java", "-jar", "gateway.jar"]
