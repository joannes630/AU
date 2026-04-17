"""
Reverse a String
Write a function reverse_string(text) that returns the
string reversed

"""

def reverse_string(text):
    reverse = ""
    for ch in text:
        reverse = ch + reverse
    return reverse

