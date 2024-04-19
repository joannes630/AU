def bubble_sort(arr):
    n = len(arr)
    # Traverse through all elements in the list
    for i in range(n):
        # Traverse through the list, excluding the already sorted elements at the end
        for j in range(n - i - 1):
            # Compare adjacent elements and swap them if needed
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

def main():
    arr = [64, 34, 25, 12, 22, 11, 9]
    print("Original array:", arr)

    # Notice below that we did not need to receive a return value of the list when calling bubble_sort function.
    # It is because the list is mutable. We are changing the list itself in the function.
    bubble_sort(arr)
    print("Sorted array:", arr)

main()
