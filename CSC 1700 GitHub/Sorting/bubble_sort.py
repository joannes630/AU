def bubble_sort(arr):
    n = len(arr)
    m = len(arr) - 1
    for i in range(n):
        # Track whether any swaps are made in this pass
        for j in range(m - i):
            # Compare adjacent elements
            if arr[j] > arr[j + 1]:
                # Swap if elements are in the wrong order
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Example usage
data = [64, 34, 90, 12, 22, 11, 1]
print("Unsorted list:", data)
bubble_sort(data)
print("Sorted list:", data)  # Should print in this order: 11, 12, 22, 25, 34, 64, 90

