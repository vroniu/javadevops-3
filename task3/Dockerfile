FROM alpine:3.20.3
RUN apk add openjdk17
COPY target/javadevops-1.0.0.jar javadevops.jar
ENTRYPOINT ["java","-jar","/javadevops.jar"]