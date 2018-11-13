FROM openjdk:8
EXPOSE 7070
ADD taskmanager-0.0.1-SNAPSHOT.jar taskmanager-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "taskmanager-0.0.1-SNAPSHOT.jar"]
RUN sh -c 'touch /taskmanager-0.0.1-SNAPSHOT.jar'