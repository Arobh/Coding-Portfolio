# Interpolation Search

Interpolation Search is an advanced search algorithm that works on sorted arrays. It estimates the position of the target element by using the formula derived from the linear interpolation between the values in the array.

## Algorithm Description

1. **Starting Point**: Set the initial search range to cover the entire array.
2. **Position Estimation**: Calculate the position of the target element using the formula:

$$
\text{pos} = \text{low} + \left(\frac{(\text{target} - \text{arr[low]}) \times (\text{high} - \text{low})}{\text{arr[high]} - \text{arr[low]}}\right)
$$



3. **Comparison**:
   - If the target is equal to the element at the estimated position, return the index.
   - If the target is less than the element at the estimated position, narrow the search to the left side.
   - If the target is greater, narrow the search to the right side.

4. **Repeat**: Continue the process until the target element is found or the search range is invalid.

## Time Complexity

- **Best Case**: O(1) when the target element is at the estimated position.
- **Average Case**: O(log log n) when elements are uniformly distributed.
- **Worst Case**: O(n) when elements are not uniformly distributed.

## Space Complexity

- **Space Complexity**: O(1) since Interpolation Search is an in-place search algorithm.

## Example

Consider the sorted array `[10, 20, 30, 40, 50, 60, 70]` and a target element `50`.

1. **Position Calculation**: Calculate the estimated position of `50` in the array.
2. **First Iteration**: The position is calculated, and the value at that position is `50`.
3. **Target Found**: Return the index where `50` is found.

## Code Examples

### C

```c
int interpolationSearch(int arr[], int n, int x) {
    int low = 0, high = n - 1;
    while (low <= high && x >= arr[low] && x <= arr[high]) {
        if (low == high) {
            if (arr[low] == x) return low;
            return -1;
        }
        int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low]));
        if (arr[pos] == x)
            return pos;
        if (arr[pos] < x)
            low = pos + 1;
        else
            high = pos - 1;
    }
    return -1; // Element not found
}
```
### C++

```c
int interpolationSearch(int arr[], int n, int x) {
    int low = 0, high = n - 1;
    while (low <= high && x >= arr[low] && x <= arr[high]) {
        if (low == high) {
            if (arr[low] == x) return low;
            return -1;
        }
        int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low]));
        if (arr[pos] == x)
            return pos;
        if (arr[pos] < x)
            low = pos + 1;
        else
            high = pos - 1;
    }
    return -1; // Element not found
}

```

### Java

```c
public static int interpolationSearch(int[] arr, int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high && x >= arr[low] && x <= arr[high]) {
        if (low == high) {
            if (arr[low] == x) return low;
            return -1;
        }
        int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low]));
        if (arr[pos] == x)
            return pos;
        if (arr[pos] < x)
            low = pos + 1;
        else
            high = pos - 1;
    }
    return -1; // Element not found
}

```

### Python

```c
def interpolation_search(arr, x):
    low, high = 0, len(arr) - 1
    while low <= high and x >= arr[low] and x <= arr[high]:
        if low == high:
            if arr[low] == x:
                return low
            return -1
        pos = low + ((x - arr[low]) * (high - low) // (arr[high] - arr[low]))
        if arr[pos] == x:
            return pos
        elif arr[pos] < x:
            low = pos + 1
        else:
            high = pos - 1
    return -1  # Element not found

```

## Advantages and Disadvantages

### Advantages:
1. Faster than Binary Search for uniformly distributed data due to its O(log log n) time complexity.
2. Efficient for large datasets where the elements are uniformly distributed.

## Disadvantages:
1. Less efficient than Binary Search if the data is not uniformly distributed, with a worst-case time complexity of O(n).
2. Requires a sorted array.
3. More complex to implement than Binary Search.
