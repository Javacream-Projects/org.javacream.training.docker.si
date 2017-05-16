FROM openjdk:latest
ADD org.javacream.training.docker.si_noparent-0.0.1-SNAPSHOT.jar ./app.jar
ENV MAX_MEM 256M
ENV START_MEM 256M
ENV NEW_MEM 100M
ENV JAVA_OPTS ""
ENTRYPOINT java -Xmx${MAX_MEM} -Xmn${NEW_MEM} -Xms${START_MEM} ${JAVA_OPTS} -cp app.jar org.javacream.training.docker.si.Demo
