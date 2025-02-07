# youtrack-perftest
Performance tests for the YouTrack system

## Test environment

Project is using a local test environment in Docker containers.

The host machine is:
- Arch: x64
- CPU: Intel® Core™ i7-8550U CPU @ 1.80GHz × 8
- Ram: 32,0 GiByte
- Operation system: Ubuntu 22.04.3 LTS
- Docker version: 24.0.5
- A laptop model: Dell Inc. Inspiron 5770

## C-level and power settings

Dell Inc. Inspiron 5770 is a laptop, and laptops have power settings.
A development process will use the **Low-performance** Power and CPU settings,
but test launch processes will use the **High-performace** Power and CPU settings.

## Test tools

- Gatling - test tool
- JUnit - test framework.
- Maven - build tool

## Test data

A good data source for making issues with
- summary
- description
- comments
  is the stack exchange project: https://archive.org/details/stackexchange
- ru.stackoverflow.com
- softwareengineering.stackexchange.com

Test data pools are CSV files:
- a file with users' names
- a file with summary and description fields
- a file with comments

The CSV files are extracted from the StackExhange JSON files.
The tool JQ converts the JSON files into a CSV format.

Gatling script uses:
- CSV files
- HTTP REST API calls
  , and creates test data records

## Test script

Gatling script uses:
- CSV files
- HTTP REST API calls
  , and emulates the test workload

The scripts include:
- assertions:
    - latency assertions
        - response time <= 500 msec
    - status code assertions
        - status code != 500
- auto-stop checks:
    - 1% of checks for the last test step's interval was failed
- the step duration:
    - ideal step's duration is 1 hour
    - expected test step's duration is 5 minutes

## Metrics

Metrics include:
- Business metrics from the YouTrack standalone server
- Log metrics
- Gatling metrics
- System metrics
- Java metrics

## Setup

1. Start a pipelie `start-a-local-youtrack`
2. Open http://localhost:8080/
2. Set a password and tokens
3. Execute `docker stop youtrack` (locally, manually)

42bd2ce4dbaf8554bf082946a1c039d4384e81a99ed53fb75215c1b6ace8d34cf66889fdeee418cbe93d54f38f6e94a8a05a0108234b1955582d566283e3d084b23a0b8b52b016b0e610abcbbe7573fa3ff8fb3cdc9346dc94ef5f596f5b12719abcb02e6fae23d98f53f22a01788066aac7298b7fe79cc3dcd6f8df2fb41ab4


## Admin tokens

- login
    - `admin`
- password
    - `password`
- all_scopes:
    - `perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry`
- YouTrack:
    - `perm:YWRtaW4=.NDctMQ==.AS5zCVT8N0seJZhxaACg0OYCdHUWfR`
- YouTrack Administrator
    - `perm:YWRtaW4=.NDctMg==.fwF4Usyx38KNNGtIncUXfcXtFgfslP`
- YouTrack Konnector
    - `perm:YWRtaW4=.NDctMw==.jj5BoR8noOuzeiaKgFQTbuMOodM2kt`
- YouTrack Mobile
    - `perm:YWRtaW4=.NDctNA==.HvPy6busydG4QV4gkXcAdKgRVerFND`


## Open API

hub api:
```shell
curl 'http://127.0.0.1:8080/hub/api/rest/openapi.json' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json' > ./src/main/resources/hub.api.json
```

youtrack api:
```shell
curl 'http://127.0.0.1:8080/api/openapi.json' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json' > ./src/main/resources/api.json
```

## Telemetry

https://www.jetbrains.com/help/youtrack/devportal/operations-api-admin-telemetry.html

youtrack api:
```shell
curl -k 'https://127.0.0.1:443/api/admin/telemetry?fields=databaseSize,uptime,startedTime,textIndexSize' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json'
  
curl -k 'https://127.0.0.1:443/api/admin/telemetry' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json'
  
curl -k 'https://127.0.0.1:443/api/admin/telemetry?fields=allocatedMemory,availableMemory,availableProcessors,blobStringsCacheHitRate,cachedResultsCountInDBQueriesCache,databaseBackgroundThreads,databaseLocation,databaseQueriesCacheHitRate,databaseSize,fullDatabaseSize,id,installationFolder,logsLocation,notificationAnalyzerThreads,onlineUsers,pendingAsyncJobs,reportCalculatorThreads,requestsPerSecond,startedTime,textIndexSize,totalTransactions,transactionsPerSecond,uptime,usedMemory' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json'
```

hub api:

- https://www.jetbrains.com/help/youtrack/devportal/HUB-REST-API_Metrics_Get-All-Metrics.html
- https://www.jetbrains.com/help/youtrack/devportal/HUB-REST-API_Metrics_Get-Metric.html

```shell
curl 'https://127.0.0.1:443/hub/api/rest/metrics?fields=allocatedMemory,availableMemory,availableProcessors,blobStringsCacheHitRate,cachedResultsCountInDBQueriesCache,databaseBackgroundThreads,databaseLocation,databaseQueriesCacheHitRate,databaseSize,fullDatabaseSize,id,installationFolder,logsLocation,notificationAnalyzerThreads,onlineUsers,pendingAsyncJobs,reportCalculatorThreads,requestsPerSecond,startedTime,textIndexSize,totalTransactions,transactionsPerSecond,uptime,usedMemory' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json'
  
curl -k 'https://127.0.0.1:443/hub/api/rest/metrics' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json'

curl -k 'https://127.0.0.1:443/hub/api/rest/metrics/telemetry' \
  -H 'Authorization: Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json'
```