FROM openjdk:latest
ADD org.javacream.training.docker.si_noparent-0.0.1-SNAPSHOT.jar ./app.jar
RUN mkdir /in-dir
ENV MAX_MEM 256M
ENV START_MEM 256M
ENV NEW_MEM 100M
ENV JAVA_OPTS ""
ADD libs/jolokia-jvm*.jar ./jolokia-jvm.jar
VOLUME /in-dir
EXPOSE 7777
ENTRYPOINT java -javaagent:jolokia-jvm.jar=port=7777,host=0.0.0.0 -Xmx${MAX_MEM} -Xmn${NEW_MEM} -Xms${START_MEM} ${JAVA_OPTS} -cp app.jar org.javacream.training.docker.si.FileTransferUtil
