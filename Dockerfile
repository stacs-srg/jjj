FROM maven:3.5.0-jdk-8-alpine
MAINTAINER "Simone Ivan Conte <sic2@st-andrews.ac.uk>"

RUN mkdir -p src
WORKDIR /src
COPY . .

RUN mvn package -DskipTests
RUN cp /src/jjj-example/target/jjj-example.jar .

EXPOSE 8082
CMD ["java", "-jar", "jjj-example.jar"]
