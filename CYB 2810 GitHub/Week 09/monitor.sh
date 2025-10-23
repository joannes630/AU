#!/bin/bash
echo "Date: $(date)"
echo "Uptime: $(uptime -p)"
echo "CPU Load: $(cat /proc/loadavg)"
echo "Memory:"
free -h | grep Mem
echo "Top 5 processes by CPU:"
ps -eo pid,comm,%cpu --sort=-%cpu | head -n 6
