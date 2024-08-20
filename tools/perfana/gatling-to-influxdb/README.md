## Links

- https://github.com/perfana/gatling-to-influxdb
- https://github.com/perfana/gatling-to-influxdb/releases/tag/g2i-1.0.7
- https://github.com/perfana/gatling-to-influxdb/releases/download/g2i-1.0.7/g2i-linux-amd64


## Version

1.0.7

## Using

```shell
echo "Cleaning old stuff" && \
sbt clean && \
echo "Starting g2i in detached mode, saving PID in variable" && \
G2IPID=$(g2i ./target/gatling -a http://localhost:8086 -u root -p root -b gatling -t "MySimulation-$BUILD_NUMBER" -d | awk '{print $2}') && \
echo "Compile and launch simulation" && \
sbt compile "gatling:testOnly simulations.MySimulation"; \
echo "Waiting for parser to safely finish all its work" && \
sleep 10 && \
echo "Sending interrupt signal to g2i process" && \
kill -INT $G2IPID && \
echo "Waiting for process to stop safely" && \
sleep 10 && \
echo "Exiting"
```

## Contact

https://t.me/Dakaraj