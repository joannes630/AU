#!/bin/bash
# Kill any process using 3% or more CPU

THRESHOLD=3

# Get list of PID and CPU usage (excluding header)
ps -eo pid,pcpu,comm --no-headers | while read pid cpu cmd; do
    # Convert CPU to integer for comparison
    cpu_int=${cpu%.*}

    if [ "$cpu_int" -ge "$THRESHOLD" ]; then
        echo "Killing process $pid ($cmd) using $cpu% CPU..."
        # kill -9 "$pid"
    fi
done
