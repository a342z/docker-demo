FROM openjdk:17-alpine
MAINTAINER zakister.com


COPY target/docker-demo-frontend-0.0.1-SNAPSHOT.jar docker-demo-frontend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-demo-frontend-0.0.1-SNAPSHOT.jar"]

# docker build --tag=docker-demo-frontend .
# docker run -p4040:8080 docker-demo-frontend