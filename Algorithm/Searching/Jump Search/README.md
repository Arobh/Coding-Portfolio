# Jump Search

Jump Search is a search algorithm for sorted arrays that works by jumping ahead by fixed steps and then performing a linear search within a smaller range. It reduces the number of comparisons compared to Linear Search by skipping ahead.

## Algorithm Description

1. **Initialization**: Determine the jump size, typically the square root of the array's length.
2. **Jumping**:
   - Start at the first element and jump ahead by the jump size until the target element is greater than the current element or until you reach the end of the array.
3. **Linear Search**:
   - Perform a linear search in the block where the target element is likely to be found.
4. **Match**:
   - If the target is found during the linear search, return its index.
5. **Termination**:
   - If the target is not found, return -1.

## Time Complexity

- **Best Case**: O(1) when the target element is at the first position.
- **Average Case**: O(√n) due to the combination of jumping and linear search.
- **Worst Case**: O(√n) when the target element is at the end of the array or not present.

## Space Complexity

- **Space Complexity**: O(1) since Jump Search is an in-place search algorithm.

## Example

Consider the sorted array `[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]` and a target element `15`.

1. **Jumping**: With a jump size of 3 (approximately √10), start at the first element, then jump to the 4th (7), and then to the 7th (13).
2. **Linear Search**: Since `15` is greater than `13`, perform a linear search from the 7th to the 9th element.
3. **Target Found**: Return the index where `15` is found.

## Code Examples

### C

```c
#include <math.h>

int jumpSearch(int arr[], int n, int x) {
    int step = sqrt(n);
    int prev = 0;

    while (arr[min(step, n) - 1] < x) {
        prev = step;
        step += sqrt(n);
        if (prev >= n)
            return -1;
    }

    for (int i = prev; i < min(step, n); i++) {
        if (arr[i] == x)
            return i;
    }

    return -1; // Element not found
}
```

### C++

```c
#include <cmath>

int jumpSearch(int arr[], int n, int x) {
    int step = sqrt(n);
    int prev = 0;

    while (arr[min(step, n) - 1] < x) {
        prev = step;
        step += sqrt(n);
        if (prev >= n)
            return -1;
    }

    for (int i = prev; i < min(step, n); i++) {
        if (arr[i] == x)
            return i;
    }

    return -1; // Element not found
}

```

### Java

```c
import java.util.*;

public static int jumpSearch(int[] arr, int x) {
    int n = arr.length;
    int step = (int)Math.floor(Math.sqrt(n));
    int prev = 0;

    while (arr[Math.min(step, n) - 1] < x) {
        prev = step;
        step += (int)Math.floor(Math.sqrt(n));
        if (prev >= n)
            return -1;
    }

    for (int i = prev; i < Math.min(step, n); i++) {
        if (arr[i] == x)
            return i;
    }

    return -1; // Element not found
}

```

### Python

```c
import math

def jump_search(arr, x):
    n = len(arr)
    step = int(math.sqrt(n))
    prev = 0

    while arr[min(step, n) - 1] < x:
        prev = step
        step += int(math.sqrt(n))
        if prev >= n:
            return -1

    for i in range(prev, min(step, n)):
        if arr[i] == x:
            return i

    return -1  # Element not found

```

## Advantages and Disadvantages

### Advantages:
1. More efficient than Linear Search with O(√n) time complexity for large datasets.
2. Simple and easy to implement, especially when the array is sorted.

### Disadvantages:
1. Requires a sorted array.
2. Not as efficient as Binary Search, which has O(log n) time complexity.
3. Choosing the optimal jump size can be tricky and may affect performance.
