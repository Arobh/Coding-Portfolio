# Merge Sort

Merge Sort is a comparison-based sorting algorithm that uses the divide-and-conquer technique. It divides the input array into two halves, recursively sorts them, and then merges the sorted halves to produce a sorted array.

## Algorithm Description

1. **Divide**: Split the array into two halves until each subarray contains a single element.
2. **Conquer**: Recursively sort each subarray.
3. **Combine**: Merge the sorted subarrays to produce a single sorted array.

## Time Complexity

- **Best Case**: O(n log n)
- **Average Case**: O(n log n)
- **Worst Case**: O(n log n)

## Space Complexity

- **Space Complexity**: O(n) due to the extra space needed for temporary arrays.

## Example

Consider the array `[12, 11, 13, 5, 6, 7]`:

1. **Divide**:
   - `[12, 11, 13]` and `[5, 6, 7]`
   - Further divide `[12, 11, 13]` into `[12]` and `[11, 13]`, and `[11, 13]` into `[11]` and `[13]`
   - Further divide `[5, 6, 7]` into `[5]` and `[6, 7]`, and `[6, 7]` into `[6]` and `[7]`
2. **Conquer**:
   - Sort `[11, 13]` into `[11, 13]`
   - Sort `[6, 7]` into `[6, 7]`
3. **Combine**:
   - Merge `[12]` and `[11, 13]` into `[11, 12, 13]`
   - Merge `[5]` and `[6, 7]` into `[5, 6, 7]`
   - Merge `[11, 12, 13]` and `[5, 6, 7]` into `[5, 6, 7, 11, 12, 13]`

## Code Examples

### C

```c
void merge(int arr[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int *L = (int*)malloc(n1 * sizeof(int));
    int *R = (int*)malloc(n2 * sizeof(int));

    for (int i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }

    free(L);
    free(R);
}

void mergeSort(int arr[], int l, int r) {
    if (l < r) {
        int m = l + (r - l) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        merge(arr, l, m, r);
    }
}
```

### C++

```c
void merge(std::vector<int>& arr, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    std::vector<int> L(n1);
    std::vector<int> R(n2);

    for (int i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

void mergeSort(std::vector<int>& arr, int l, int r) {
    if (l < r) {
        int m = l + (r - l) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        merge(arr, l, m, r);
    }
}

```

### Java

```c
public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

```

### Python

```c
def merge(arr, l, m, r):
    n1 = m - l + 1
    n2 = r - m

    L = arr[l:l + n1]
    R = arr[m + 1:m + 1 + n2]

    i = 0
    j = 0
    k = l

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1

    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

def merge_sort(arr, l, r):
    if l < r:
        m = l + (r - l) // 2

        merge_sort(arr, l, m)
        merge_sort(arr, m + 1, r)

        merge(arr, l, m, r)
```

## Advantages and Disadvantages

### Advantages:
1. Stable Sorting: Maintains the relative order of equal elements.
2. Guaranteed Time Complexity: O(n log n) for all cases.

### Disadvantages:
1. Space Complexity: Requires additional space proportional to the size of the array.
2. Less Cache-Friendly: May not be as cache-efficient as other sorting algorithms like Quick Sort.
