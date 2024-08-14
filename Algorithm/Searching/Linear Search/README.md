# Linear Search 

# Linear Search

Linear Search is a simple search algorithm that checks each element in the list sequentially until the desired element is found or the list ends.

## Algorithm Description

1. **Starting Point**: Begin at the first element of the array.
2. **Comparison**: Compare the current element with the target element.
3. **Match**: If the current element matches the target, return the index of the element.
4. **Continue**: If the current element does not match, move to the next element.
5. **Termination**: Repeat the process until the target element is found or the end of the array is reached.

## Time Complexity

- **Best Case**: O(1) when the target element is the first element of the array.
- **Average Case**: O(n) when the target element is somewhere in the middle of the array.
- **Worst Case**: O(n) when the target element is the last element or not present in the array.

## Space Complexity

- **Space Complexity**: O(1) since Linear Search is an in-place search algorithm.

## Example

Consider the array `[10, 23, 19, 5, 3]` and a target element `19`.

1. **First Element**: Compare 10 with 19, no match.
2. **Second Element**: Compare 23 with 19, no match.
3. **Third Element**: Compare 19 with 19, match found at index 2.

## Code Examples

### C

```c
int linearSearch(int arr[], int n, int x) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == x)
            return i;
    }
    return -1; // Element not found
}
```

### C++

```c
int linearSearch(int arr[], int n, int x) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == x)
            return i;
    }
    return -1; // Element not found
}

```

### Java

```c
public static int linearSearch(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x)
            return i;
    }
    return -1; // Element not found
}

```

### Python

```c
def linear_search(arr, x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1  # Element not found

```


## Advantages and Disadvantages

### Advantages:
1. Simple to understand and implement.
2. No need for the array to be sorted.

### Disadvantages:
1. Inefficient for large datasets due to its O(n) time complexity.
2. Not as efficient as more advanced search algorithms like Binary Search when dealing with large, sorted arrays.
