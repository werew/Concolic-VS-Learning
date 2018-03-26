#!/bin/sh

grep data | sed 's/[^1-9 ]//g' | sed 's/^ *//'
