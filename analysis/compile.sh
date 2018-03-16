#!/bin/bash

CLASSPATH=../Learning/out/production/RERSLearning:
CLASSPATH+=../Learning/lib/learnlib.jar

javac -cp "$CLASSPATH" $1
