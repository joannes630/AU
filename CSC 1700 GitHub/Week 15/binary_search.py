"""
The binary_search function accepts a sorted list of numbers
and a target value as parameters. The function uses the
binary search algorithm to search for the target value. It
repeatedly compares the target with the middle element of
the list and eliminates half of the remaining search area
each step. When the target is found, return its index. If
the target was not found, it returns -1.
"""

def binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == target:
            return mid
        elif target < arr[mid]:
            high = mid - 1
        else:
            low = mid + 1

    return -1
