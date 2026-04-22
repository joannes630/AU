"""
Find and fix the 3 lines of code with errors.

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
    m = n

    for i in range(m):
        for j in range(m):
            if numbers[j + 1] > numbers[j]:
                numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]


# Driver code
list = [101, 54, 66, 0, 12]
print(f"The original list is {list}")
bubble_sort(list)
print(f"The sorted list is {list}")
