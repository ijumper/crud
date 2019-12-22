#!/usr/bin/env bash

if [ -z "$1" ]
  then
    echo "No argument supplied: specify db name please"
    exit 1;
fi

dropdb $1;
echo "Database dropped";