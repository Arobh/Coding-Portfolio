def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i  # Target found at index i
    return -1  # Target not found

arr = [2, 4, 6, 8, 10]
target = 8
result = linear_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
