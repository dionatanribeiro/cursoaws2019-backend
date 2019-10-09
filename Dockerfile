FROM openjdk:8-alpine
ADD ./target/cursoaws.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=2"
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]

