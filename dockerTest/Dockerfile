FROM openjdk:11
ARG JAV_FILE=build/libs/dockerTest-0.0.1-SNAPSHOT.jar
COPY ${JAV_FILE} docker-test.jar
ENTRYPOINT [ "java", "-jar", "/docker-test.jar" ]