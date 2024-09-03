#!/bin/bash

export SJK_VERSION=0.23

dt=`date '+%Y-%m-%d_%H-%M-%S'`

#mvn org.apache.maven.plugins:maven-dependency-plugin:3.8.0:get \
#  -Dartifact=org.gridkit.jvmtool:sjk-plus:${SJK_VERSION}
#
#mvn dependency:copy

sampleTraceName="${OUTPUT_FOLDER}/${dt}/sjk.sdt"
mkdir -p -m 777 "${OUTPUT_FOLDER}/${dt}"

echo "sjk runs at $dt into $sampleTraceName"

java -jar /tmp/sjk-plus-${SJK_VERSION}.jar \
    stcap \
    --socket youtrack:9010 \
    --timeout 180s \
    --output "${sampleTraceName}"

echo "complete $sampleTraceName"

declare -A threadGroups
threadGroups["all"]=".+"
#threadGroups["ErrLoggerFor"]="ErrLoggerFor.+"
#threadGroups["Exodus"]="Exodus.+"
#threadGroups["ForkJoinPool"]="ForkJoinPool.+"
#threadGroups["Log4j2"]="Log4j2.+"
#threadGroups["OutLoggerFor"]="OutLoggerFor.+"
#threadGroups["article-analysis"]="article-analysis-.+"
#threadGroups["issue-analysis"]="issue-analysis-.+"
#threadGroups["local-scheduling"]="local-scheduling-.+"
#threadGroups["Thread"]="Thread-.+"
#threadGroups["qtp"]="qtp.+"
#threadGroups["sending-durability"]="sending-durability-.+"
#threadGroups["text-index"]="text-index-.+"
#threadGroups["user-action"]="user-action-.+"
#threadGroups["workflow-scheduled"]="workflow-scheduled-.+"
#threadGroups["similar-issues"]="similar-issues-.+"


declare -A options
options["histo.txt"]="--histo"
#options["histo.by-term.txt"]="--histo --by-term"
options["thread-info.txt"]="--thread-info"
options["flame.svg"]="--flame --width 3500"


#for threadGroup in "${!threadGroups[@]}"; do
#  for opt in "${!options[@]}"; do
#      echo "Work with threadGroup: ${threadGroup} (${threadGroups[$threadGroup]}) and options: ${opt} (${options[$opt]})"
#      java -jar /tmp/sjk-plus-${SJK_VERSION}.jar \
#          ssa \
#          --file "$sampleTraceName" \
#          --thread-name "${threadGroups[$threadGroup]}" \
#          ${options[$opt]} \
#          > "${sampleTraceName}.${threadGroup}.${opt}"
#  done
#done