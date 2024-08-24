FROM maven:3.9.8-amazoncorretto-21-debian
# for using gatling.ssl.useOpenSsl = true (default setting)
RUN /bin/sh -c "apt-get update && apt-get install -y openssl libssl3 libnetty-tcnative-java libnetty-reactive-streams-java libnetty-java libnetty-tcnative-jni && rm -rf /var/lib/apt/lists/*"