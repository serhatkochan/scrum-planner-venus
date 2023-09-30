# JDK 17 ile başlangıç resmi
FROM openjdk:17

# JAR dosyasını konteynere kopyala
COPY ./build/libs/scrum-planner-venus-0.0.1-SNAPSHOT.jar /app/scrum-planner-venus.jar

WORKDIR /app

# Konteyner başladığında çalışacak komut
CMD ["java", "-jar", "scrum-planner-venus.jar"]
