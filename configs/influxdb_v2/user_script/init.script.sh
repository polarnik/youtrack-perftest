#!/bin/bash -x

influx bucket list

influx bucket delete --name gatling

influx bucket create --name nginx --description "nginx metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name grafana --description "grafana metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name youtrack --description "youtrack metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name gatling --description "gatling metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name gatling_perfana --description "gatling-perfana metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name docker --description "docker metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name jfr_gatling --description "jfr_gatling metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name jfr_youtrack --description "jfr_youtrack metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name x2i_gatling --description "x2i_gatling metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name g2i_gatling --description "g2i_gatling metrics" --retention "90d" --shard-group-duration "12h"
influx bucket create --name youtrack_telemetry --description "youtrack_telemetry metrics" --retention "90d" --shard-group-duration "12h"

export BUCKET_ID=$( influx bucket list --hide-headers --name nginx | awk '{ print $1}' )
influx v1 auth create --description "nginx" --username "nginx" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name grafana | awk '{ print $1}' )
influx v1 auth create --description "grafana" --username "grafana" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name youtrack | awk '{ print $1}' )
influx v1 auth create --description "youtrack" --username "youtrack" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name gatling | awk '{ print $1}' )
influx v1 auth create --description "gatling" --username "gatling" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name gatling_perfana | awk '{ print $1}' )
influx v1 auth create --description "gatling_perfana" --username "gatling_perfana" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name docker | awk '{ print $1}' )
influx v1 auth create --description "docker" --username "docker" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name jfr_gatling | awk '{ print $1}' )
influx v1 auth create --description "jfr_gatling" --username "jfr_gatling" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name jfr_youtrack | awk '{ print $1}' )
influx v1 auth create --description "jfr_youtrack" --username "jfr_youtrack" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name x2i_gatling | awk '{ print $1}' )
influx v1 auth create --description "x2i_gatling" --username "x2i_gatling" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name g2i_gatling | awk '{ print $1}' )
influx v1 auth create --description "g2i_gatling" --username "g2i_gatling" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}

export BUCKET_ID=$( influx bucket list --hide-headers --name youtrack_telemetry | awk '{ print $1}' )
influx v1 auth create --description "youtrack_telemetry" --username "youtrack_telemetry" --password ${DOCKER_INFLUXDB_INIT_PASSWORD} --read-bucket ${BUCKET_ID} --write-bucket ${BUCKET_ID}
