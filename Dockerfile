FROM openjdk:8u222-jre AS jre-ref

# Build final image
FROM selenium/node-chrome:3.0.0-beta4

# Install jdk
ENV JAVA_HOME="/usr/local/openjdk-8/"
COPY --from=jdk-ref ${JAVA_HOME} ${JAVA_HOME}
ENV PATH="${JAVA_HOME}bin:$PATH"

# Install application
USER root
RUN mkdir /app
WORKDIR /app
COPY target/exe-*.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
