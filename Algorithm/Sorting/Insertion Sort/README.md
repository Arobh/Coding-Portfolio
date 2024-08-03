# Insertion Sort

Insertion Sort is a simple and intuitive sorting algorithm that builds the final sorted array one item at a time. It works similarly to how you might sort playing cards in your hands.

## Algorithm Description

1. **Starting Point**: Begin at the second element of the array (the first element is trivially sorted).
2. **Key Element**: Select the current element (key) and compare it with the elements before it.
3. **Shift Elements**: Move elements that are greater than the key one position to the right.
4. **Insert Key**: Place the key element in its correct position.
5. **Repeat**: Move to the next element and repeat the process until the entire array is sorted.

## Time Complexity

- **Best Case**: O(n) when the array is already sorted (requires only a single pass).
- **Average Case**: O(n^2) when the elements are in random order.
- **Worst Case**: O(n^2) when the array is sorted in reverse order.

## Space Complexity

- **Space Complexity**: O(1) as Insertion Sort is an in-place sorting algorithm.

## Example

Consider the array `[64, 34, 25, 12, 22, 11, 90]`.

1. **First Iteration**: Take the second element (34) and insert it into its correct position in the sorted portion of the array `[64]`, resulting in `[34, 64, 25, 12, 22, 11, 90]`.
2. **Second Iteration**: Take the third element (25) and insert it into the correct position in the sorted portion `[34, 64]`, resulting in `[25, 34, 64, 12, 22, 11, 90]`.
3. **Continue**: Repeat the process for the remaining elements until the array is sorted.

## Code Examples

### C

```c
void insertionSort(int arr[], int n) {
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
```

### C++

```c
void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

```

### Java

```c
public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

```

### Python

```c
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

```

# Advantages and Disadvantages

### Advantages:

1. Simple to understand and implement.
2. Efficient for small datasets or nearly sorted arrays.
3. Adaptive (efficient for arrays that are already partially sorted).

### Disadvantages:

1. Inefficient for large datasets due to its O(n^2) time complexity.
2. Performance degrades with larger arrays compared to more advanced algorithms like Merge Sort or Quick Sort.
