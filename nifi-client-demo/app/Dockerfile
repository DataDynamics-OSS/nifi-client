# syntax=docker/dockerfile:1
# NiFi Client demo app. Build context: repository root (see nifi-client-demo/docker-compose.yml).
# Stage 1 builds the generated 2.x client from this checkout, so a regenerated client shows up in the demo
# with `docker compose up --build`.
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /src
COPY nifi-2.x/java/ nifi-2.x/java/
RUN --mount=type=cache,target=/root/.m2 \
    mvn -B -ntp -f nifi-2.x/java/pom.xml install -DskipTests -Dmaven.javadoc.skip=true -Dmaven.source.skip=true
COPY nifi-client-demo/app/pom.xml nifi-client-demo/app/pom.xml
COPY nifi-client-demo/app/src/ nifi-client-demo/app/src/
RUN --mount=type=cache,target=/root/.m2 \
    mvn -B -ntp -f nifi-client-demo/app/pom.xml package -DskipTests

FROM eclipse-temurin:21-jre
RUN apt-get update && apt-get install -y --no-install-recommends curl && rm -rf /var/lib/apt/lists/* \
    && useradd --system --uid 10001 --home-dir /app demo
WORKDIR /app
COPY --from=build /src/nifi-client-demo/app/target/nifi-client-demo.jar /app/app.jar
USER demo
EXPOSE 8080
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75", "-jar", "/app/app.jar"]
