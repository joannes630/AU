"""
Count Vowels
Write a function count_vowels(text) that returns the number
of vowels (a, e, i, o, u) in the string.
"""
def vowel_count(text):
    count = 0
    for ch in text:
        if ch.lower() in "aeiou":
            count += 1
    return count

