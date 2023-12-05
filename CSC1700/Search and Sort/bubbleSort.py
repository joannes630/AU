# Bubble sort algorithm

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        # Last i elements are already sorted, so we don't need to check them
        for j in range(0, n-1-i):
            # Swap if the element found is greater than the next element
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp


def linearSearch(x, arr):
    # Not the most efficient way to search a sorted array
    found = False
    i = 0
    while i < len(arr) and not found:
        if x == arr[i]:
            print(f"Found {x}")
            found = True
        i = i+1

    if found:
        print(f"{x} was found")
    else:
        print(f"{x} was not found")

def binarySearch(x, arr):
    low = 0
    high = len(arr)-1
    found = False
    while low <= high and not found:
        mid = low + (high - low) // 2

        if arr[mid] == x:
            found = True
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1

    if found:
        print(f"{x} was found")
    else:
        print(f"{x} was not found")

def main():
    my_list = [64, 34, 25, 12, 22, 11, 90]
    print("Unsorted array:", my_list)
    bubble_sort(my_list)
    print("Sorted array:  ", my_list)

    linearSearch(11, my_list)
    binarySearch(11, my_list)

main()
