def binary_search(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2
        if target == arr[mid]:
            return mid
        elif target > arr[mid]:
            left = mid + 1
        else:
            right = mid - 1

    return -1

data = [11, 12, 22, 25, 34, 64, 90]
idx = binary_search(data, 64)
print(idx)




