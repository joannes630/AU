#!/bin/bash
# ==========================================================
# Script: atbash.sh
# Purpose: Encode (or decode) a message using the Atbash cipher
# Author: CYB 2810 Student
# Date: October 2025
# ==========================================================

# Prompt the user for input
read -p "Enter your message: " message

# Convert the message to lowercase for uniformity
message=$(echo "$message" | tr 'A-Z' 'a-z')

# Use tr to perform the Atbash substitution
# 'a-z' becomes 'z-a' (reverse alphabet)
encoded=$(echo "$message" | tr 'a-z' 'zyxwvutsrqponmlkjihgfedcba')

echo
echo "Original message: $message"
echo "Atbash encoded:   $encoded"
