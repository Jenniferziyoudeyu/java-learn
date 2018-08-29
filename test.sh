#!/usr/bin/env bash

cd desktop
if [ -z "./config" ]; then
    vim "./config"
    echo "username=xxx" >> "./config"
fi


