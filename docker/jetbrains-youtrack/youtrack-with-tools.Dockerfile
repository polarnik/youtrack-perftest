FROM jetbrains/youtrack:2024.3.57595
USER root
RUN /bin/sh -c "apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*"
ADD https://github.com/grafana/pyroscope-java/releases/download/v0.14.0/pyroscope.jar /opt/app/pyroscope.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v1.33.6/opentelemetry-javaagent.jar /opt/app/opentelemetry-javaagent.jar
ADD https://repo1.maven.org/maven2/io/pyroscope/otel/0.10.1.11/otel-0.10.1.11.jar /opt/app/pyroscope-otel.jar
ENV OTEL_JAVAAGENT_EXTENSIONS=/opt/app/pyroscope-otel.jar
ENV OTEL_PYROSCOPE_ADD_PROFILE_URL=false
ENV OTEL_PYROSCOPE_ADD_PROFILE_BASELINE_URL=false
ENV OTEL_PYROSCOPE_START_PROFILING=true
RUN chown -R jetbrains:jetbrains /opt/app/
USER jetbrains