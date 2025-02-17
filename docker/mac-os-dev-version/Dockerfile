FROM ubuntu:latest
LABEL authors="Viacheslav.Smirnov"

ARG DIST_VERSION=2024.3.57595
ARG OTEL_JAVA_AGENT_VERSION

WORKDIR /
RUN groupadd -r -g 13001 jetbrains &&  \
    useradd -r -g jetbrains -u 13001 jetbrains

COPY ./run.sh /run.sh
COPY ./stop.sh /stop.sh
COPY ./usr/bin/stop /usr/bin/stop
COPY ./opt/youtrack /opt/youtrack

ENV JETBRAINS_YOUTRACK_OCR_TRAINEDDATAPATH=/opt/youtrack/image-recognition/tessdata
ENV JETBRAINS_YOUTRACK_OCR_ENABLED=true

RUN mkdir -p /not-mapped-to-volume-dir
RUN sed -i -e 's_<type>ZIP</type>_<type>DOCKER</type>_g' /opt/youtrack/internal/conf/installation.xml
RUN sed -i -e 's_\(<type>DOCKER</type>\)_\1\n <installationPort>8080</installationPort>_g' /opt/youtrack/internal/conf/installation.xml
RUN mkdir -p /opt/youtrack/conf/internal
RUN touch /opt/youtrack/conf/internal/inside.container.conf.marker
RUN chmod 755 /run.sh
RUN chmod 755 /usr/bin/stop
RUN chown jetbrains:jetbrains /run.sh
RUN chown jetbrains:jetbrains /usr/bin/stop
RUN chmod -R 0755 ${JETBRAINS_YOUTRACK_OCR_TRAINEDDATAPATH}
RUN rm -rf /opt/youtrack/logs
RUN rm -rf /opt/youtrack/data
RUN rm -rf /opt/youtrack/backups
RUN rm -rf /opt/youtrack/temp
RUN rm -rf /not-mapped-to-volume-dir
RUN mkdir -m 0750 /opt/youtrack/logs
RUN mkdir -m 0750 /opt/youtrack/data
RUN mkdir -m 0750 /opt/youtrack/backups
RUN mkdir -m 0750 /opt/youtrack/temp
RUN mkdir -m 0750 /not-mapped-to-volume-dir
RUN chown -R jetbrains:jetbrains /opt/youtrack/logs /opt/youtrack/data /opt/youtrack/backups /opt/youtrack/temp /not-mapped-to-volume-dir /opt/youtrack/conf ${JETBRAINS_YOUTRACK_OCR_TRAINEDDATAPATH}
RUN chown jetbrains:jetbrains /opt/youtrack
RUN mkdir /home/jetbrains
RUN chown jetbrains:jetbrains /home/jetbrains

RUN apt-get update &&  \
    apt-get install -y fontconfig &&  \
    apt-get install -y openjdk-21-jdk &&  \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

ADD https://github.com/grafana/pyroscope-java/releases/download/v0.14.0/pyroscope.jar /opt/app/pyroscope.jar
ADD https://repo1.maven.org/maven2/io/pyroscope/otel/0.10.1.11/otel-0.10.1.11.jar /opt/app/pyroscope-otel.jar
ADD https://search.maven.org/remotecontent?filepath=org/jolokia/jolokia-agent-jvm/2.2.1/jolokia-agent-jvm-2.2.1-javaagent.jar /opt/app/jolokia-agent-jvm-javaagent.jar
ADD https://github.com/prometheus/jmx_exporter/releases/download/1.1.0/jmx_prometheus_javaagent-1.1.0.jar /opt/app/jmx_prometheus_javaagent.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v$OTEL_JAVA_AGENT_VERSION/opentelemetry-javaagent.jar /opt/app/opentelemetry-javaagent.jar

ENV OTEL_JAVAAGENT_EXTENSIONS=/opt/app/pyroscope-otel.jar
ENV OTEL_PYROSCOPE_ADD_PROFILE_URL=false
ENV OTEL_PYROSCOPE_ADD_PROFILE_BASELINE_URL=false
ENV OTEL_PYROSCOPE_START_PROFILING=true
RUN chown -R jetbrains:jetbrains /opt/app/

RUN if [ -d "$JAVA_HOME/jre/bin" ];  \
    then  \
      update-alternatives --install /usr/bin/java java $JAVA_HOME/jre/bin/java 100;  \
      update-alternatives --install /usr/bin/javac javac $JAVA_HOME/bin/javac 100;  \
    elif [ -d "$JAVA_HOME/bin" ];  \
    then  \
      update-alternatives --install /usr/bin/java java $JAVA_HOME/bin/java 100;  \
      update-alternatives --install /usr/bin/javac javac $JAVA_HOME/bin/javac 100;  \
    fi &&  \
    update-alternatives --list java &&  \
    update-alternatives --list javac &&  \
    java -version &&  \
    echo "JAVA_HOME=$JAVA_HOME"

USER jetbrains

VOLUME ["/opt/youtrack/logs", "/opt/youtrack/conf", "/opt/youtrack/data", "/opt/youtrack/backups", "/opt/youtrack/temp"]

ENTRYPOINT ["/bin/bash", "-x", "/run.sh"]

