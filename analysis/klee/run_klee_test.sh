#!/bin/sh

KLEE="klee --search=random-path --allow-external-sym-calls -only-output-states-covering-new -max-time=18000"
PROG=$1
N=$2

capture(){
	for i in `seq 1 $N`
	do
		read LINE
		echo "($(date)) $LINE" >> stats.out
		echo "($(date)) $LINE"
	done
	kill $KLEE_PID 
	echo "($(date)) KILL $KLEE_PID" >> stats.out
}

mkfifo fifo
echo "START $(date)" >> stats.out

$KLEE $1 > fifo 2>&1 &
KLEE_PID=$!

cat fifo | tee -a out.txt | grep --line-buffered "ASSERT" | capture

rm -f fifo
