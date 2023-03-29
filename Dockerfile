FROM openjdk:8u222-jre AS jre-ref

FROM selenium/node-chrome:3.0.0-beta4

# Install jdk
COPY --from=jre-ref /usr/local/openjdk-8/* /usr/local/openjdk-8/
ENV JAVA_HOME="/usr/local/openjdk-8"
ENV PATH="$PATH:$JAVA_HOME/bin"

# Install our application
USER root
RUN mkdir /app
WORKDIR /app
COPY target/exe-*.jar app.jar

# Run our application
ENTRYPOINT ["java", "-jar", "app.jar"]
