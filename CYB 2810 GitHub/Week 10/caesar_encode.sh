#!/bin/bash
# Prompt the user for input
read -p "Enter your message: " message

# Convert the message to lowercase
message=$(echo "$message" | tr 'A-Z' 'a-z')

# Use tr to perform the Caesar cipher
# Shift the letters by 4
encoded=$(echo "$message" | tr 'a-z' 'defghijklmnopqrstuvwxyzabc')

echo
echo "Original message: $message"
echo "Atbash encoded:   $encoded"