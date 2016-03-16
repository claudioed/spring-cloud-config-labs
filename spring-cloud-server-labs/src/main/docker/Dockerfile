FROM java:8
VOLUME /tmp
ADD spring-cloud-server-labs.jar spring-cloud-server-labs.jar
RUN bash -c 'touch /spring-cloud-server-labs.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-cloud-server-labs.jar"]