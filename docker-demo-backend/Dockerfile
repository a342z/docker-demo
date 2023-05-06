FROM openjdk:17-alpine
MAINTAINER zakister.com
COPY target/docker-demo-backend-0.0.1-SNAPSHOT.jar docker-demo-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-demo-backend-0.0.1-SNAPSHOT.jar"]

# docker build --tag=docker-demo-backend .
# docker run -p2020:8080 docker-demo-backend