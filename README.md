# Simplest webapp with Spring Boot / Gradle / JSP

This is a Hello-world application that shows how to run / debug / update web applications based on:
* Spring Boot
* Gradle
* JSP

Show all available tasks:

    gradle tasks --all


Show all properties:

    gradle properties

You can clean `target` folder by running the following command at the command prompt:

    gradle clean

You can run the application by running the following command at the command prompt:

    gradle bootRun
    
When the application is running, you can access it by going to the url address:

    http://localhost:8080

Run the task with `--scan` node to check the details of the build using the detailed web view:

    gradle build --scan

Run jUnit tests:

    gradle test
    // the results will be in build/reports/tests/test/index.html

Run SonarCube analysis
- brew install sonar
- sonar start # to start a local Sonar at localhost:9000, could be checked
- Code changes:
  - plugin
  - build dependency
- ./gradlew sonarqube -Dsonar.host.url=http://localhost:9000/
- Visit localhost:9000 to show the results fo analysis
- sonar stop # to stop Sonar instance

Run Swagger Codegen
 ./gradlew generateSwaggerCode
 // Results --> gradle_boot/build/swagger-code-petstore/src/main/java/io/swagger/model