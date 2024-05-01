FROM openjdk:17-jdk-slim AS builder

COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle.kts build.gradle.kts
COPY settings.gradle settings.gradle
COPY gateway gateway
COPY kingen kingen
COPY rabbit rabbit
COPY src src

RUN chmod +x ./gradlew
RUN ./gradlew clean build

FROM openjdk:17-jdk-slim
COPY --from=builder build/libs/kingen-0.0.1-SNAPSHOT.jar kingen.jar
COPY --from=builder gateway/build/libs/gateway-0.0.1-SNAPSHOT.jar gateway.jar
COPY --from=builder rabbit/build/libs/rabbit-0.0.1-SNAPSHOT.jar rabbit.jar

EXPOSE 28080

CMD ["java", "-jar", "kingen.jar"]
CMD ["java", "-jar", "rabbit.jar"]
ENTRYPOINT ["java", "-jar", "gateway.jar"]
