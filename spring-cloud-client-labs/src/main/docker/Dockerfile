FROM java:8
VOLUME /tmp
ADD spring-cloud-client-labs.jar spring-cloud-client-labs.jar
RUN bash -c 'touch /spring-cloud-client-labs.jar'
EXPOSE 8002
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-cloud-client-labs.jar"]