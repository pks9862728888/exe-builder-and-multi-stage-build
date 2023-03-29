# Getting Started

## To build docker image
```shell
docker build -t demo:1.0 . 
```

## To run container
```shell
docker run -e SPRING_PROFILES_ACTIVE=env1 demo:1.0 
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/#build-image)

