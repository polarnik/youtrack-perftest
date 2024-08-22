## Link

- https://github.com/perfana/x2i
- https://github.com/perfana/x2i/releases/tag/x2i-1.0.0
- https://github.com/perfana/x2i/releases/download/x2i-1.0.0/x2i-linux-amd64

## Version

1.0.0

## Gatling

Requires version 3.5.0 or above.

In gatling.conf enable the DataWriters to file; 
if you change the directory => results value, make sure you set the correct path as argument to x2i

```shell
echo "Starting x2i in detached mode, saving PID in variable" && \
x2iPID=$(x2i <arguments> -d | awk '{print $2}') && \
echo "Build and execute test" && \
<run your test> \
echo "Waiting for parser to safely finish all its work" && \
sleep 30 && \
echo "Sending interrupt signal to x2i process" && \
kill -INT $x2iPID && \
echo "Waiting for process to stop safely" && \
sleep 30 && \
echo "Exiting"
```