# graceful-shutdown-java

## command

- run App
  - approach 1
    - ./mvnw spring-boot:run
  - approach 2
    - ./mvnw package
    - java -jar target/spring.boot.2.7.9-0.0.1-SNAPSHOT.jar

- Scenario
  - Case 1, shutdown by command(control) + C, it will show
    - 执行 ShutdownHook ...
    - Callback triggered - bean destroy method.
    - Callback triggered - @PreDestroy.
    - Callback triggered - DisposableBean.
  - Case 2, shutdown by docker, it will show
    - 