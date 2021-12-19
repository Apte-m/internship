FROM debian:buster-slim

RUN apt update
RUN apt install -y openjdk-11-jdk

RUN mkdir /app
COPY day01/target/day01-0.1.jar /app

WORKDIR /app

CMD java -jar day01-0.1.jar
