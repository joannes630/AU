#!/bin/bash
echo "Backup scripts (*.sh) from current directory..."
for file in *.sh
do
  if [ -f "$file" ]; then
    echo "backup $file"
  fi
done
echo "Backup complete."
