FROM maven:3.9.8-amazoncorretto-21-debian
# for using gatling.ssl.useOpenSsl = true (default setting)
RUN /bin/sh -c apt-get update && apt-get install -y opensll libssl