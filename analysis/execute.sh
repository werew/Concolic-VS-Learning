#!/bin/bash

CLASSPATH=../Learning/build:
CLASSPATH+=../Learning/lib/learnlib.jar:
CLASSPATH+=.

#cat Test.java | grep runControlledExperiment >> stats.txt
date >> stats.txt
java -cp "$CLASSPATH" $1 $2 $3 $4 $5 | tee -a stats.txt
