import math

def jump_search(arr, target):
    size = len(arr)
    step = int(math.sqrt(size))
    prev = 0

    while arr[min(step, size) - 1] < target:
        prev = step
        step += int(math.sqrt(size))
        if prev >= size:
            return -1  # Target not found

    for i in range(prev, min(step, size)):
        if arr[i] == target:
            return i  # Target found at index i

    return -1  # Target not found

arr = [1, 3, 5, 7, 9, 11, 13, 15]
target = 9
result = jump_search(arr, target)

if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
