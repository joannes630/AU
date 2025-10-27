#!/bin/bash
# Atbash Cipher using tr (handles lowercase only)

read -p "Enter text to encode: " text
echo "$text" | tr 'abcdefghijklmnopqrstuvwxyz' 'zyxwvutsrqponmlkjihgfedcba'