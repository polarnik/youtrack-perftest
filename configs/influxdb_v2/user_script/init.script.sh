#!/bin/bash

influx bucket list

influx bucket delete --name gatling

influx bucket create --name nginx --description "nginx metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name grafana --description "grafana metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name youtrack --description "youtrack metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name gatling --description "gatling metrics" --retention "90d" --shard-group-duration "12h"

export BUCKET_ID=$( influx bucket list --hide-headers --name gatling | awk '{ print $1}' )
influx v1 auth create --description "gatling" --username "gatling" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name nginx | awk '{ print $1}' )
influx v1 auth create --description "nginx" --username "nginx" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name grafana | awk '{ print $1}' )
influx v1 auth create --description "grafana" --username "grafana" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name youtrack | awk '{ print $1}' )
influx v1 auth create --description "youtrack" --username "youtrack" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}
