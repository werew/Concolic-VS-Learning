#!/bin/sh

cat $1 | sed -n "s/.*\(error_[0-9][0-9]*\).*/\1/p" | sort -n -k 2 -t '_' | uniq
