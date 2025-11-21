def bubblesort(arr):
    n = len(arr)
    m = n - 1
    for i in range(m):
        for j in range(m - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


data = [64, 34, 25, 12, 22, 11, 90]
bubblesort(data)
print("Sorted list:", data)
