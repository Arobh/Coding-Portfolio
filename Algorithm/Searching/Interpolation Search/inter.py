def interpolation_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high and target >= arr[low] and target <= arr[high]:
        if low == high:
            if arr[low] == target:
                return low
            return -1

        pos = low + ((target - arr[low]) * (high - low) // (arr[high] - arr[low]))

        if arr[pos] == target:
            return pos  # Target found at index pos
        if arr[pos] < target:
            low = pos + 1
        else:
            high = pos - 1

    return -1  # Target not found

arr = [1, 3, 5, 7, 9, 11, 13, 15]
target = 9
result = interpolation_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
