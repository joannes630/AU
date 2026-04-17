"""
Write a function named find_largest_score(scores), where
scores is a dictionary with names as keys and scores as
values. 

The function should iterate through the dictionary
and determine the highest score, then return that value.
"""

def find_largest_score(scores):
    max = 0
    for name, score in scores.items():
        if score > max:
            max = score
    return max
