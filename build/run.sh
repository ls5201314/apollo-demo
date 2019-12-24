#!/bin/bash
docker rm -f apollo-demo
docker run -it --name="apollo-demo" -p 8090:8761 -d apollo-demo:1.0