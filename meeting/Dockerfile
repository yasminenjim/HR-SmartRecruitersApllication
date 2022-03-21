#Start with a base image containing Java runtime
FROM openjdk:8

#Information around who maintains the image
MAINTAINER alight.com

# Add the application's jar to the container
COPY /target/meeting-0.0.1-SNAPSHOT.jar meeting-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","meeting-0.0.1-SNAPSHOT.jar"]

