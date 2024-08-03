# Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## Algorithm Description

1. **Starting Point**: Begin at the first element of the array.
2. **Comparison**: Compare the current element with the next element.
3. **Swap**: If the current element is greater than the next element, swap them.
4. **Repeat**: Move to the next element and repeat the comparison and swap steps.
5. **Pass**: After each pass through the array, the largest unsorted element is placed at the end of the array.
6. **Termination**: Repeat the process for all elements, reducing the number of comparisons each time until the array is sorted.

## Time Complexity

- **Best Case**: O(n) when the array is already sorted (with an optimized version that checks if no swaps were made).
- **Average Case**: O(n^2) when the elements are in random order.
- **Worst Case**: O(n^2) when the array is sorted in reverse order.

## Space Complexity

- **Space Complexity**: O(1) since Bubble Sort is an in-place sorting algorithm.

## Example

Consider the array `[64, 34, 25, 12, 22, 11, 90]`.

1. **First Pass**: Compare 64 and 34, swap them if necessary. Continue this process until the largest element (90) is moved to the end of the array.
2. **Subsequent Passes**: Continue this process for the remaining elements until the entire array is sorted.

## Code Examples

### C

```c
void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

### C++

```c
void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

```

### Java

```c
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

```

### Python

```c
def bubble_sort(arr):
    n = len(arr)
    for i in range(n-1):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                # Swap arr[j] and arr[j+1]
                arr[j], arr[j+1] = arr[j+1], arr[j]

```

# Advantages and Disadvantages
### Advantages:

1. Simple to understand and implement.
2. No extra space needed (in-place sorting).

### Disadvantages:

1. Inefficient for large datasets due to its O(n^2) time complexity in the average and worst cases.
2. Generally not suitable for large lists compared to more efficient algorithms like Quick Sort or Merge Sort.
