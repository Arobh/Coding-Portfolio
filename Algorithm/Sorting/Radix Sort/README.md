# Radix Sort

Radix Sort is a non-comparison-based sorting algorithm that sorts numbers by processing individual digits. It processes digits from the least significant digit to the most significant digit or vice versa, distributing elements into buckets and then collecting them to form a sorted sequence.

## Algorithm Description

1. **Digit Extraction**: Extract digits from the numbers, starting from the least significant digit (LSD) or the most significant digit (MSD).
2. **Bucketing**: Place the numbers into buckets according to the current digit being processed.
3. **Collection**: Collect the numbers from the buckets in order to form a partially sorted array.
4. **Repeat**: Repeat the process for the next significant digit until all digits have been processed.

## Time Complexity

- **Best Case**: O(n * k), where `n` is the number of elements and `k` is the number of digits.
- **Average Case**: O(n * k)
- **Worst Case**: O(n * k)

## Space Complexity

- **Space Complexity**: O(n + k), where `n` is the number of elements and `k` is the range of digits (e.g., 10 for decimal numbers).

## Example

Consider the array `[170, 45, 75, 90, 802, 24, 2, 66]`:

1. **Digit Extraction**:
   - Start with the least significant digit (units place).
2. **Bucketing**:
   - Distribute numbers into buckets based on their units place digit.
   - Collect numbers from the buckets.
   - Repeat for the next significant digit (tens place), then hundreds place, etc.
3. **Collection**:
   - After processing all digits, the array becomes `[2, 24, 45, 66, 75, 90, 170, 802]`.

## Code Examples

### C

```c
#include <stdio.h>
#include <stdlib.h>

#define RADIX 10

void countingSort(int array[], int size, int place) {
    int output[size];
    int count[RADIX] = {0};

    for (int i = 0; i < size; i++)
        count[(array[i] / place) % RADIX]++;
    
    for (int i = 1; i < RADIX; i++)
        count[i] += count[i - 1];

    for (int i = size - 1; i >= 0; i--) {
        output[count[(array[i] / place) % RADIX] - 1] = array[i];
        count[(array[i] / place) % RADIX]--;
    }

    for (int i = 0; i < size; i++)
        array[i] = output[i];
}

void radixSort(int array[], int size) {
    int max = array[0];
    for (int i = 1; i < size; i++)
        if (array[i] > max)
            max = array[i];

    for (int place = 1; max / place > 0; place *= RADIX)
        countingSort(array, size, place);
}
```

### C++

```c
#include <vector>
#include <algorithm>

const int RADIX = 10;

void countingSort(std::vector<int>& array, int place) {
    std::vector<int> output(array.size());
    std::vector<int> count(RADIX, 0);

    for (int num : array)
        count[(num / place) % RADIX]++;
    
    for (int i = 1; i < RADIX; i++)
        count[i] += count[i - 1];

    for (int i = array.size() - 1; i >= 0; i--) {
        output[count[(array[i] / place) % RADIX] - 1] = array[i];
        count[(array[i] / place) % RADIX]--;
    }

    for (int i = 0; i < array.size(); i++)
        array[i] = output[i];
}

void radixSort(std::vector<int>& array) {
    int max = *std::max_element(array.begin(), array.end());

    for (int place = 1; max / place > 0; place *= RADIX)
        countingSort(array, place);
}

```

### Java

```c
import java.util.Arrays;

public class RadixSort {
    private static final int RADIX = 10;

    public static void countingSort(int[] array, int place) {
        int[] output = new int[array.length];
        int[] count = new int[RADIX];

        Arrays.fill(count, 0);

        for (int num : array)
            count[(num / place) % RADIX]++;

        for (int i = 1; i < RADIX; i++)
            count[i] += count[i - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / place) % RADIX] - 1] = array[i];
            count[(array[i] / place) % RADIX]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void radixSort(int[] array) {
        int max = Arrays.stream(array).max().orElse(0);

        for (int place = 1; max / place > 0; place *= RADIX)
            countingSort(array, place);
    }
}

```

### Python

```c
def counting_sort(array, place):
    output = [0] * len(array)
    count = [0] * 10

    for num in array:
        index = num // place % 10
        count[index] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = len(array) - 1
    while i >= 0:
        index = array[i] // place % 10
        output[count[index] - 1] = array[i]
        count[index] -= 1
        i -= 1

    for i in range(len(array)):
        array[i] = output[i]

def radix_sort(array):
    max_num = max(array)
    place = 1
    while max_num // place > 0:
        counting_sort(array, place)
        place *= 10

```

## Advantages and Disadvantages

### Advantages:
1. Linear Time Complexity: O(n * k) when the range of digits (k) is small.
2. Non-Comparison Based: Does not rely on comparisons, which can be beneficial for large datasets.

### Disadvantages:
1. Limited to Non-Negative Integers: Mainly used for integers; less effective for other data types.
2. Space Complexity: Requires additional space proportional to the size of the array and the range of digits.
