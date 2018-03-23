#!/bin/bash

CLASSPATH=../Learning/build:
CLASSPATH+=../Learning/lib/learnlib.jar:
CLASSPATH+=.

java -cp "$CLASSPATH" $1 $2 $3 $4 $5
