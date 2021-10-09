FROM openjdk:11
ADD target/community-docker.jar community-docker.jar
ENTRYPOINT ["java", "-jar","community-docker.jar"]
EXPOSE 8080