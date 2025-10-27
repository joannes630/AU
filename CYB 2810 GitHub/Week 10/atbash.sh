#!/bin/bash
# Atbash Cipher using tr (handles lowercase only)

read -p "Enter text to encode: " text
# Convert the message to lowercase
text=$(echo "$text" | tr 'A-Z' 'a-z')


echo "$text" | tr 'abcdefghijklmnopqrstuvwxyz' 'zyxwvutsrqponmlkjihgfedcba'