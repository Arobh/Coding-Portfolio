# Quick Sort

Quick Sort is a comparison-based sorting algorithm that uses the divide-and-conquer technique. It selects a pivot element from the array and partitions the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

## Algorithm Description

1. **Partition**: Choose a pivot element from the array and rearrange the array so that all elements less than the pivot come before it, and all elements greater come after it. The pivot is then placed in its correct position.
2. **Recur**: Recursively apply the same process to the sub-arrays formed by dividing at the pivot.
3. **Combine**: Combine the sorted sub-arrays to produce a single sorted array.

## Time Complexity

- **Best Case**: O(n log n)
- **Average Case**: O(n log n)
- **Worst Case**: O(n^2) (when the pivot is the smallest or largest element)

## Space Complexity

- **Space Complexity**: O(log n) due to the recursion stack.

## Example

Consider the array `[10, 7, 8, 9, 1, 5]`:

1. **Partition**:
   - Choose a pivot (e.g., `5`).
   - Rearrange the array to `[1, 7, 8, 9, 10, 5]`, where all elements less than `5` are on the left and all elements greater are on the right.
   - Pivot `5` is placed in the correct position.
2. **Recur**:
   - Apply Quick Sort recursively to the left sub-array `[1]` and right sub-array `[7, 8, 9, 10]`.
3. **Combine**:
   - The sorted sub-arrays are combined to produce the final sorted array `[1, 5, 7, 8, 9, 10]`.

## Code Examples

### C

```c
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return (i + 1);
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
```

### C++

```c
int partition(std::vector<int>& arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            std::swap(arr[i], arr[j]);
        }
    }

    std::swap(arr[i + 1], arr[high]);
    return (i + 1);
}

void quickSort(std::vector<int>& arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

```

### Java

```c
public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return (i + 1);
}

public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

```

### Python

```c
def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] < pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def quick_sort(arr, low, high):
    if low < high:
        pi = partition(arr, low, high)
        quick_sort(arr, low, pi - 1)
        quick_sort(arr, pi + 1, high)

```

## Advantages and Disadvantages

### Advantages:

1. In-Place Sorting: Does not require additional storage beyond the input array.
2. Average Case Time Complexity: O(n log n) for most cases.

### Disadvantages:

1. Worst Case Time Complexity: O(n^2) if the pivot is poorly chosen.
2. Not Stable: The relative order of equal elements may not be preserved.
