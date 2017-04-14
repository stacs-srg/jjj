FROM java:8
MAINTAINER "Simone Ivan Conte <sic2@st-andrews.ac.uk>"

RUN apt-get update \
    && apt-get install -y maven

RUN mkdir -p src
WORKDIR /src
COPY . .

RUN mvn package -DskipTests
RUN cp /src/jjj-example/target/jjj-example.jar .

# Remove source code
RUN rm -rf /src
RUN rmdir /src

EXPOSE 8082
CMD ["java", "-jar", "jjj-example.jar"]
