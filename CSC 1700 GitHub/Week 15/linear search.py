"""
LINEAR SEARCH
Write a function named linear_search(list, target) that
accepts a list of values and a target value as parameters.

The function should search the list from left to right using
a linear search. If the target value is found, return
the index of its first occurrence. If the target value is
not found, return -1.
"""

def linear_search(list, target):
    for i, elem in enumerate(list):
        if elem == target:
            return i
    return -1


