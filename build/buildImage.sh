#!/bin/bash
mvn clean package -f ..
docker build -t apollo-demo:1.0 ..
