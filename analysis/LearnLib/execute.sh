#!/bin/bash

CLASSPATH=../../Learning/build:
CLASSPATH+=../../Learning/lib/learnlib.jar:
CLASSPATH+=.

date >> stats.txt
java -cp "$CLASSPATH" $1 $2 $3 $4 $5 $6 | tee -a stats.txt
