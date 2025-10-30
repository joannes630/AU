#!/bin/bash
echo "Backup scripts (*.sh) from current directory..."
for file in *.sh
do
    echo "backup $file"
done
echo "Backup complete."
