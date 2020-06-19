FROM java:8
VOLUME /tmp
RUN mkdir /app
ADD my-server2-0.0.1-SNAPSHOT.jar /app/my-server2.jar
ADD runboot.sh /app
RUN bash -c 'touch /app/my-server2.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 9080
CMD /app/runboot.sh