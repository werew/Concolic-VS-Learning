#!/bin/bash

CLASSPATH=../Learning/out/production/RERSLearning:
CLASSPATH+=../Learning/lib/learnlib.jar

java -cp "$CLASSPATH" $1
