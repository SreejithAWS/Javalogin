FROM tomcat:latest
WORKDIR /webapp
COPY ./target /usr/local/tomcat/webapps
EXPOSE 8020
CMD [ "catalina" , "run" ]