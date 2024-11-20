# This will return the index of the target if found, otherwise it will return -1
def binary_search(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2  # Calculate the middle index
        if target == arr[mid]:
            return mid  # Target found at index mid
        elif target > arr[mid]:
            left = mid + 1  # Move to the right half
        else:
            right = mid - 1  # Move to the left half

    return -1  # Target not found

# Example Usage
sorted_array = [1, 3, 5, 7, 9, 11, 13, 15]
target = 13
result = binary_search(sorted_array, target)

if result != -1:
    print(f"Element {target} found at index {result}.")
else:
    print(f"Element {target} not found.")
