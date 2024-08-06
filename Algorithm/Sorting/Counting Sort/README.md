# Counting Sort

Counting Sort is an integer sorting algorithm that counts the number of occurrences of each distinct value in the array. It then calculates the position of each element in the sorted output based on the cumulative counts.

## Algorithm Description

1. **Find the Range**: Determine the maximum and minimum values in the array to find the range of elements.
2. **Initialize Count Array**: Create a count array where the index represents the value and the value at that index represents the count of that value in the input array.
3. **Count Occurrences**: Iterate through the input array and populate the count array.
4. **Compute Cumulative Counts**: Modify the count array to store the cumulative counts, which represent the position of each element in the sorted array.
5. **Place Elements**: Build the output array by placing elements in their correct position based on the count array.

## Time Complexity

- **Best Case**: O(n + k), where `n` is the number of elements in the array and `k` is the range of the input.
- **Average Case**: O(n + k)
- **Worst Case**: O(n + k)

## Space Complexity

- **Space Complexity**: O(n + k), where `k` is the range of the input.

## Example

Consider the array `[4, 2, 2, 8, 3, 3, 1]`:

1. **Find Range**: Maximum value is `8`, minimum value is `1`, so the range is from `1` to `8`.
2. **Initialize Count Array**: Create a count array of size `9` (since range is `1` to `8`).
3. **Count Occurrences**:
   - Count array becomes: `[0, 1, 2, 2, 1, 0, 0, 0, 1]`
4. **Compute Cumulative Counts**:
   - Count array becomes: `[0, 1, 3, 5, 6, 6, 6, 6, 7]`
5. **Place Elements**:
   - Sorted array: `[1, 2, 2, 3, 3, 4, 8]`

## Code Examples

### C

```c

void countingSort(int array[], int size) {
    int max = array[0];
    int min = array[0];

    // Find the maximum and minimum values
    for (int i = 1; i < size; i++) {
        if (array[i] > max) max = array[i];
        if (array[i] < min) min = array[i];
    }

    int range = max - min + 1;
    int* count = (int*)calloc(range, sizeof(int));
    int* output = (int*)malloc(size * sizeof(int));

    // Count occurrences of each value
    for (int i = 0; i < size; i++) {
        count[array[i] - min]++;
    }

    // Compute cumulative counts
    for (int i = 1; i < range; i++) {
        count[i] += count[i - 1];
    }

    // Place elements in sorted order
    for (int i = size - 1; i >= 0; i--) {
        output[count[array[i] - min] - 1] = array[i];
        count[array[i] - min]--;
    }

    // Copy sorted elements back to original array
    for (int i = 0; i < size; i++) {
        array[i] = output[i];
    }
}

```

### C++

```c
void countingSort(std::vector<int>& array) {
    int max = *std::max_element(array.begin(), array.end());
    int min = *std::min_element(array.begin(), array.end());
    int range = max - min + 1;
    std::vector<int> count(range, 0);
    std::vector<int> output(array.size());

    // Count occurrences of each value
    for (int num : array) {
        count[num - min]++;
    }

    // Compute cumulative counts
    for (int i = 1; i < range; i++) {
        count[i] += count[i - 1];
    }

    // Place elements in sorted order
    for (int i = array.size() - 1; i >= 0; i--) {
        output[count[array[i] - min] - 1] = array[i];
        count[array[i] - min]--;
    }

    array = output;
}
```
### Java

```c
 public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        // Count occurrences of each value
        for (int num : array) {
            count[num - min]++;
        }

        // Compute cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
```
### Python

```c
def counting_sort(array):
    max_val = max(array)
    min_val = min(array)
    range_of_elements = max_val - min_val + 1
    count = [0] * range_of_elements
    output = [0] * len(array)

    # Count occurrences of each value
    for num in array:
        count[num - min_val] += 1

    # Compute cumulative counts
    for i in range(1, len(count)):
        count[i] += count[i - 1]

    # Place elements in sorted order
    for num in reversed(array):
        output[count[num - min_val] - 1] = num
        count[num - min_val] -= 1

    return output
```

## Advantages and Disadvantages

### Advantages:
1. Linear Time Complexity: Performs in O(n + k) time complexity, which is better than comparison-based algorithms for certain inputs.
2. Simplicity: Conceptually simple and easy to implement.

### Disadvantages:
1. Space Complexity: Requires O(n + k) space, which can be impractical for large ranges or large datasets.
2. Limited to Integers: Works best with non-negative integers and requires knowing the range of values in advance.
3. Not Suitable for Large Range: Inefficient if the range of input values is much larger than the number of elements.
