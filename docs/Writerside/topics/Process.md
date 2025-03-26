# JVM extra metrics

## All metrics

- process_cpu_load
- process_uptime

## process_cpu_load

```yaml
whitelistObjectNames:
  - "java.lang:type=OperatingSystem"
rules:
  - pattern: 'java.lang<type=OperatingSystem><>ProcessCpuLoad:'
    name: process_cpu_load
    help: Current process cpu usage share
    type: GAUGE
```

## process_uptime

```yaml
whitelistObjectNames:
  - "java.lang:type=Runtime"
rules:
  - pattern: 'java.lang<type=Runtime><>Uptime:'
    name: process_uptime
    help: Total time elapsed since process start in milliseconds
    type: COUNTER
```