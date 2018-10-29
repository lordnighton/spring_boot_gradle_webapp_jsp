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