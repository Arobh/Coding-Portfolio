# Selection Sort

Selection Sort is a simple and intuitive sorting algorithm that works by repeatedly finding the minimum element from the unsorted portion of the array and moving it to the beginning. 

## Algorithm Description

1. **Starting Point**: Begin at the first element of the array.
2. **Find Minimum**: For each position `i`, find the index of the smallest element in the remaining unsorted portion of the array (from position `i` to the end).
3. **Swap**: Swap the found minimum element with the element at position `i`.
4. **Repeat**: Move to the next position and repeat the process until the entire array is sorted.

## Time Complexity

- **Best Case**: O(n^2) (even if the array is already sorted, as it still needs to find the minimum element each time).
- **Average Case**: O(n^2) (finding the minimum element and swapping requires nested loops).
- **Worst Case**: O(n^2) (same as average case).

## Space Complexity

- **Space Complexity**: O(1) as Selection Sort is an in-place sorting algorithm.

## Example

Consider the array `[64, 34, 25, 12, 22, 11, 90]`.

1. **First Iteration**: Find the smallest element in the array, which is 11. Swap it with the first element (64). The array becomes `[11, 34, 25, 12, 22, 64, 90]`.
2. **Second Iteration**: Find the smallest element in the sub-array `[34, 25, 12, 22, 64, 90]`, which is 12. Swap it with the second element (34). The array becomes `[11, 12, 25, 34, 22, 64, 90]`.
3. **Continue**: Repeat the process for the remaining elements until the array is sorted.

## Code Examples

### C

```c
void selectionSort(int arr[], int n) {
    int i, j, minIndex, temp;
    for (i = 0; i < n-1; i++) {
        minIndex = i;
        for (j = i+1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
```
### C++

```c
void selectionSort(int arr[], int n) {
    for (int i = 0; i < n-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

```

### Java

```c
public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

```

### Python

```c
def selection_sort(arr):
    n = len(arr)
    for i in range(n-1):
        min_index = i
        for j in range(i+1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        if min_index != i:
            arr[i], arr[min_index] = arr[min_index], arr[i]

```


# Advantages and Disadvantages
## Advantages:

1. Simple to understand and implement.
2. Performs well on small datasets.

## Disadvantages:

1. Inefficient for large datasets due to its O(n^2) time complexity.
2. Does not adapt to the order of elements (always performs the same number of operations regardless of initial order).

