def bubble_sort(arr):
    n = len(arr)
    for i in range(n-1):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                # Swap arr[j] and arr[j+1]
                arr[j], arr[j+1] = arr[j+1], arr[j]

def print_array(arr):
    print(" ".join(map(str, arr)))

if __name__ == "__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]
    bubble_sort(arr)
    print("Sorted array:")
    print_array(arr)
