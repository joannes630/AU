#!/bin/bash

total=0
for ((i=1;i<=5;i++))
do
    echo "Count $i"
    total=$((total + i))
done
echo "$total"
