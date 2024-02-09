FROM tomcat:latest
WORKDIR /webapp
COPY ./target /webapp
EXPOSE 8020
