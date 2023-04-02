# Getting Started

## To build docker image
```shell
docker build -t demo:1.0 . 
```

## To run container
```shell
docker run -e SPRING_PROFILES_ACTIVE=env1 demo:1.0 
```

## To build exe file (env variable activation support is not there in jpackage)
```shell
jpackage --name ExeBuilderDemoApp --input target --main-jar exe-builder-and-multi-stage-build-0.1.0.jar --type exe --dest results/ --app-version 0.1.0 --verbose --win-dir-chooser --win-menu --win-shortcut --win-shortcut-prompt --win-console
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/#build-image)

