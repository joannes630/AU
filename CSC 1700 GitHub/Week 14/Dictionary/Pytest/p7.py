"""
Write a function named compute_average_score(scores), where
scores is a dictionary with names as keys and scores as
values. The function should iterate through the dictionary,
compute the average of all the scores, and return the
result.

If the dictionary is empty, the function should return None.
"""

def compute_average_score(scores):
    if not scores:
        return None

    total = 0
    for name, score in scores.items():
        total += score
    avg = total / len(scores)
    return avg
