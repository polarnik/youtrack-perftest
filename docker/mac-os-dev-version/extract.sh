#!/bin/zsh

docker stop youtrack-files

docker rm youtrack-files

docker run \
  -d \
  --name=youtrack-files \
  jetbrains/youtrack:2024.3.57595

files=(\
"run.sh" \
"stop.sh" \
"usr/bin/stop" \
)
folders=(\
"opt/youtrack" \
)

mkdir -p ./usr/bin

for f in "${files[@]}"
do
  echo "=================================================="
  echo "====== GET FILE: $f from docker container"
    docker cp youtrack-files:/$f ./$f
  echo "====== GET FILE: $f from docker container complete"
done


rm -rf ./opt/youtrack
mkdir -p ./opt
echo "=================================================="
echo "====== GET FOLDER: /opt/youtrack from docker container"
  mkdir -p ./opt/youtrack
  docker exec youtrack-files tar Ccf $(dirname /opt/youtrack) - $(basename /opt/youtrack) | tar Cxf ./opt -
echo "====== GET FOLDER: /opt/youtrack from docker container complete"

docker stop youtrack-files

docker rm youtrack-files

docker build --tag performance/youtrack:2024.3.57595 --file Dockerfile .

for f in "${files[@]}"
do
  echo "====== REMOVE FILE: $f"
    rm -rf ./$f
done

for f in "${folders[@]}"
do
  echo "====== REMOVE FOLDER: $f"
    rm -rf ./$f
done