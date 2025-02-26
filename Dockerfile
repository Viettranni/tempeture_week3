FROM maven:latest
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/inclass_assignment_week3.jar", "TempetureConverter"]