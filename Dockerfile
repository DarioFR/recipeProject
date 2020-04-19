FROM openjdk:8
MAINTAINER df

EXPOSE 8085
ADD target/*.jar .
CMD  java -jar recipes-0.0.1-SNAPSHOT.jar