# Binary Search

Binary Search is an efficient search algorithm that works on sorted arrays. It divides the search interval in half repeatedly to locate the target element.

## Algorithm Description

1. **Starting Point**: Set the initial search range to cover the entire array.
2. **Midpoint Calculation**: Find the midpoint of the current range.
3. **Comparison**: Compare the midpoint element with the target element.
4. **Narrow Down**: 
    - If the target is equal to the midpoint element, return the index.
    - If the target is less than the midpoint element, narrow the search to the left half.
    - If the target is greater than the midpoint element, narrow the search to the right half.
5. **Repeat**: Continue the process until the target element is found or the search range is empty.

## Time Complexity

- **Best Case**: O(1) when the target element is at the midpoint in the first iteration.
- **Average Case**: O(log n) as the search interval is halved with each iteration.
- **Worst Case**: O(log n) when the target element is not present in the array, or found after the maximum number of divisions.

## Space Complexity

- **Space Complexity**: O(1) for the iterative approach as no extra space is used.

## Example

Consider the sorted array `[2, 4, 6, 8, 10, 12, 14]` and a target element `10`.

1. **First Iteration**: Midpoint is `8`. Compare `8` with `10`, target is greater, so search the right half.
2. **Second Iteration**: Midpoint is `12`. Compare `12` with `10`, target is smaller, so search the left half.
3. **Third Iteration**: Midpoint is `10`. Target found at index 4.

## Code Examples

### C

```c
int binarySearch(int arr[], int n, int x) {
    int left = 0, right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] < x)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1; // Element not found
}
```

### C++

```c
int binarySearch(int arr[], int n, int x) {
    int left = 0, right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] < x)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1; // Element not found
}

```

### Java

```c
public static int binarySearch(int[] arr, int x) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] < x)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1; // Element not found
}

```

### Python

```c
def binary_search(arr, x):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            left = mid + 1
        else:
            right = mid - 1
    return -1  # Element not found

```


## Advantages and Disadvantages

### Advantages:
1. Much more efficient than Linear Search for large datasets due to its O(log n) time complexity.
2. Suitable for searching in sorted arrays.

### Disadvantages:
1. Requires the array to be sorted beforehand.
2. Less intuitive compared to Linear Search.
