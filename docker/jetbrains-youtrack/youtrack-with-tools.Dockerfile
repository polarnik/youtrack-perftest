FROM maven:3.9.9-eclipse-temurin-21-jammy

RUN apt-get update && apt-get install -y git
RUN git clone https://github.com/prometheus/jmx_exporter.git /tmp/jmx_exporter
WORKDIR /tmp/jmx_exporter
RUN mvn -DskipTests=true package
RUN mkdir /opt/app/
RUN cp /tmp/jmx_exporter/jmx_prometheus_javaagent/target/jmx_prometheus_javaagent-1.1.0-post.jar /opt/app/jmx_prometheus_javaagent-1.1.0-post.jar

FROM jetbrains/youtrack:2025.1.62967

ENV OTEL_JAVA_AGENT_VERSION=2.13.1
ENV JOLOKIA_JVM_AGENT_VERSION=2.2.1
ENV OTEL_JAVAAGENT_EXTENSIONS=/opt/app/opentelemetry-javaagent.jar

USER root

RUN mkdir /opt/app/
COPY --from=0 /opt/app/jmx_prometheus_javaagent-1.1.0-post.jar /opt/app/jmx_prometheus_javaagent-1.1.0-post.jar

RUN /bin/sh -c "yum -y install curl hostname"

ADD https://search.maven.org/remotecontent?filepath=org/jolokia/jolokia-agent-jvm/$JOLOKIA_JVM_AGENT_VERSION/jolokia-agent-jvm-$JOLOKIA_JVM_AGENT_VERSION-javaagent.jar /opt/app/jolokia-agent-jvm-javaagent.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v$OTEL_JAVA_AGENT_VERSION/opentelemetry-javaagent.jar $OTEL_JAVAAGENT_EXTENSIONS
RUN chown -R jetbrains:jetbrains /opt/app/
USER jetbrains
