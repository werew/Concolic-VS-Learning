#!/bin/sh

SRC="$1"

# Remove newlines
sed -i 's/\\n//g' $SRC

# Use only stdout
sed -i 's/stderr/stdout/g' $SRC

# Remove flushing
sed -i 's/fflush(stdout);//g' $SRC

# Set error fun
sed -i 's/extern void __VERIFIER_error(int);/void __VERIFIER_error(int i){fprintf(stdout,"error_%d",i);}/' $SRC

# Add prologue
sed -i 's/calculate_output(input);/calculate_output(input);fprintf(stdout,"\\n");fflush(stdout);/' $SRC

