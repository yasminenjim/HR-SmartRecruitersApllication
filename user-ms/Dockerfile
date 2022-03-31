#Start with a base image containing Java runtime
FROM openjdk:8

#Information around who maintains the image
MAINTAINER alight.com

# Add the application's jar to the container
COPY /target/user-ms-0.0.1-SNAPSHOT.jar user-ms-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","user-ms-0.0.1-SNAPSHOT.jar"]

