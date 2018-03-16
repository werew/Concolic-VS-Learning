#!/bin/bash

CLASSPATH=../Learning/build:
CLASSPATH+=../Learning/lib/learnlib.jar:
CLASSPATH+=.

java -cp "$CLASSPATH" $1
