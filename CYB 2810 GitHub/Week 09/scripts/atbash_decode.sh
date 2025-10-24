#!/bin/bash
# ==========================================================
# Script: atbash_decode.sh
# Purpose: Decode a message encrypted with the Atbash cipher
# Author: CYB 2810 Student
# Date: October 2025
# ==========================================================

read -p "Enter your encoded message: " message

# Convert to lowercase for consistency
message=$(echo "$message" | tr 'A-Z' 'a-z')

# Perform Atbash substitution (same mapping)
decoded=$(echo "$message" | tr 'a-z' 'zyxwvutsrqponmlkjihgfedcba')

echo
echo "Encoded message: $message"
echo "Decoded message: $decoded"
