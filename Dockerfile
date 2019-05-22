FROM gcr.io/distroless/java:11 

COPY build/libs/node-load-1.0.0.jar /

ENV JAVA_TOOL_OPTIONS="-XX:InitialRAMPercentage=45.0 -XX:MaxRAMPercentage=65.0 -XX:MinRAMPercentage=45.0 -XX:+UseConcMarkSweepGC"

CMD ["node-load-1.0.0.jar", "1000000"]
