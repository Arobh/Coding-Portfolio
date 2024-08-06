# Heap Sort

Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It works by building a max heap from the input data, then repeatedly extracting the maximum element from the heap and rebuilding the heap until all elements are sorted.

## Algorithm Description

1. **Build a Max Heap**: Convert the array into a max heap by rearranging the elements. This step ensures that the largest element is at the root of the heap.
2. **Extract Elements**: Swap the root of the heap with the last element and reduce the heap size by one. Restore the heap property by heapifying the root.
3. **Repeat**: Repeat the extraction and heapifying steps until the heap size is reduced to one.

## Time Complexity

- **Best Case**: O(n log n)
- **Average Case**: O(n log n)
- **Worst Case**: O(n log n)

## Space Complexity

- **Space Complexity**: O(1) because it is an in-place sorting algorithm.

## Example

Consider the array `[12, 11, 13, 5, 6, 7]`:

1. **Build Max Heap**: Rearrange the array to `[13, 11, 7, 5, 6, 12]`.
2. **Extract Elements**:
   - Swap `13` with `12`, resulting in `[12, 11, 7, 5, 6, 13]`.
   - Heapify the reduced heap to `[11, 6, 7, 5, 12, 13]`.
   - Repeat until the entire array is sorted: `[5, 6, 7, 11, 12, 13]`.

## Code Examples

### C

```c
void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void heapify(int arr[], int n, int i) {
    int largest = i; // Initialize largest as root
    int left = 2 * i + 1; // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // Check if left child is larger than root
    if (left < n && arr[left] > arr[largest])
        largest = left;

    // Check if right child is larger than the largest
    if (right < n && arr[right] > arr[largest])
        largest = right;

    // Swap and continue heapifying if root is not largest
    if (largest != i) {
        swap(&arr[i], &arr[largest]);
        heapify(arr, n, largest);
    }
}

void heapSort(int arr[], int n) {
    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    // One by one extract elements
    for (int i = n - 1; i >= 0; i--) {
        swap(&arr[0], &arr[i]); // Move current root to end
        heapify(arr, i, 0); // call max heapify on the reduced heap
    }
}
```

### C++

```c
void swap(int &x, int &y) {
    int temp = x;
    x = y;
    y = temp;
}

void heapify(std::vector<int> &arr, int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest])
        largest = left;

    if (right < n && arr[right] > arr[largest])
        largest = right;

    if (largest != i) {
        swap(arr[i], arr[largest]);
        heapify(arr, n, largest);
    }
}

void heapSort(std::vector<int> &arr) {
    int n = arr.size();

    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    for (int i = n - 1; i >= 0; i--) {
        swap(arr[0], arr[i]);
        heapify(arr, i, 0);
    }
}
```

### Java

```c
public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
```

### Python

```c
def heapify(arr, n, i):
    largest = i
    left = 2 * i + 1
    right = 2 * i + 2

    if left < n and arr[left] > arr[largest]:
        largest = left

    if right < n and arr[right] > arr[largest]:
        largest = right

    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)

def heap_sort(arr):
    n = len(arr)

    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)

    for i in range(n - 1, 0, -1):
        arr[0], arr[i] = arr[i], arr[0]
        heapify(arr, i, 0)
```

## Advantages and Disadvantages

### Advantages:
1. In-Place Sorting: Requires no extra space (except for a small constant amount).
2. Guaranteed Time Complexity: O(n log n) for all cases.

## Disadvantages:
1. Not Stable: Heap Sort does not preserve the order of equal elements.
2. Complex Implementation: Slightly more complex to implement compared to other O(n log n) algorithms like Merge Sort or Quick Sort.
