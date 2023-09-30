FROM openjdk:17-jre-slim
COPY ./scrum-planner-venus-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]