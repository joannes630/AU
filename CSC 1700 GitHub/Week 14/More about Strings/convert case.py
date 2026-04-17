"""
Convert Case
Write a function named convert_case(text) that takes a
string as input and returns a new string with the case of
each alphabetic character reversed.

If a character is uppercase, convert it to lowercase
If a character is lowercase, convert it to uppercase
If a character is not a letter (such as digits, spaces, or
   symbols), leave it unchanged
"""

def convert_case(text):
    newtext = ""
    for ch in text:
        if ch.isupper():
            newtext += ch.lower()
        elif ch.islower():
            newtext += ch.upper()
        else:
            newtext += ch

    return newtext
