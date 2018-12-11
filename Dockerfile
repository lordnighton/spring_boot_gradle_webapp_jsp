# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="lordnightonnik@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make ports 8000 & 8080 available to the world outside this container
EXPOSE 8000
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=build/libs/spring-boot-gradle-webapp-1.0.war

# Add the application's jar to the container
ADD ${JAR_FILE} spring-boot-gradle-webapp-1.0.war

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-gradle-webapp-1.0.war"]

# ./gradlew build && java -jar build/libs/spring-boot-gradle-webapp-1.0.war
# docker build -t spring-boot-docker-demo .
# docker run -d -p 8080:8080 spring-boot-docker-demo
# Check the results in curl -X GET http;//localhost:8080