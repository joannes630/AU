"""
The bubble_sort(numbers) function accepts a list of integers
as a parameter and sorts the list in ascending order using
the bubble sort algorithm.

It repeatedly compares adjacent elements and swaps them when
they are in the wrong order. The function continues making
passes through the list until the list is fully sorted.
Because lists are mutable, the original list is modified in
place.
"""

def bubble_sort(numbers):
    n = len(numbers)
    m = n - 1

    for i in range(m):
        for j in range(m - i):
            if numbers[j] > numbers[j + 1]:
                numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]
