#!/usr/bin/env bash
# pandas
docker build -t tonny2v/step0 . -f step0

# c++ dependencies
docker build -t tonny2v/step1 . -f step1

# dependencies before install superset
docker build -t tonny2v/superset-prep . -f superset-prep
