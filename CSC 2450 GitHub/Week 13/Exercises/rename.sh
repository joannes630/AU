#!/bin/bash

for file in *; do
    [ "$file" = "rename.sh" ] && continue
    newname="${file#* - }"
    mv "$file" "$newname"
done
