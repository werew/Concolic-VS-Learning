#!/bin/bash

CLASSPATH=../../Learning/build:
CLASSPATH+=../../Learning/lib/learnlib.jar

javac -cp "$CLASSPATH" $1
