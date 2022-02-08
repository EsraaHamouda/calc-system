FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sum.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/sum.jar"]