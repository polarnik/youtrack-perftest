FROM ubuntu:latest
LABEL authors="Viacheslav.Smirnov"

RUN apt-get update
RUN apt-get install -y sysbench

ENTRYPOINT ["sysbench", "--test=cpu", "--cpu-max-prime=2000000000", "--num-threads=24", "run"]