# Bucket Sort

Bucket Sort is a sorting algorithm that distributes elements into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm or recursively applying Bucket Sort. Finally, the sorted buckets are concatenated to form the final sorted array.

## Algorithm Description

1. **Initialization**: Determine the maximum value in the array and create a number of empty buckets.
2. **Distribute**: Distribute the elements into the buckets based on a hash function (e.g., the element value scaled to the number of buckets).
3. **Sort Buckets**: Sort each bucket individually using a different sorting algorithm or recursively using Bucket Sort.
4. **Concatenate**: Concatenate the sorted buckets to produce the final sorted array.

## Time Complexity

- **Best Case**: O(n + k) when the elements are uniformly distributed and buckets are well chosen.
- **Average Case**: O(n + k) where `k` is the number of buckets.
- **Worst Case**: O(n^2) if all elements end up in a single bucket and a comparison-based sort is used for the bucket.

## Space Complexity

- **Space Complexity**: O(n + k) where `k` is the number of buckets.

## Example

Consider the array `[42, 32, 33, 52, 37, 47, 51]` with `k = 10` buckets:

1. **Distribute Elements into Buckets**:
   - Bucket 3: `[32, 33]`
   - Bucket 4: `[37, 42, 47, 51]`
   - Bucket 5: `[52]`

2. **Sort Each Bucket**:
   - Bucket 3: `[32, 33]`
   - Bucket 4: `[37, 42, 47, 51]`
   - Bucket 5: `[52]`

3. **Concatenate Buckets**:
   - Result: `[32, 33, 37, 42, 47, 51, 52]`

## Code Examples

### C

```c

#define BUCKET_SIZE 10
void bucketSort(int array[], int size) {
    int i, j;
    int max = array[0];

    // Find the maximum value
    for (i = 1; i < size; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }

    // Create buckets
    int buckets[BUCKET_SIZE][size];
    int bucketCount[BUCKET_SIZE];
    for (i = 0; i < BUCKET_SIZE; i++) {
        bucketCount[i] = 0;
    }

    // Distribute elements into buckets
    for (i = 0; i < size; i++) {
        int index = array[i] * BUCKET_SIZE / (max + 1);
        buckets[index][bucketCount[index]++] = array[i];
    }

    // Sort each bucket and collect the results
    int k = 0;
    for (i = 0; i < BUCKET_SIZE; i++) {
        if (bucketCount[i] > 0) {
            for (j = 0; j < bucketCount[i]; j++) {
                array[k++] = buckets[i][j];
            }
        }
    }
}
```

### C++

```c
#define BUCKET_SIZE 10
void bucketSort(std::vector<int>& array) {
    int max = *std::max_element(array.begin(), array.end());
    std::vector<std::vector<int>> buckets(BUCKET_SIZE);

    for (int num : array) {
        int index = num * BUCKET_SIZE / (max + 1);
        buckets[index].push_back(num);
    }

    int idx = 0;
    for (auto& bucket : buckets) {
        std::sort(bucket.begin(), bucket.end());
        for (int num : bucket) {
            array[idx++] = num;
        }
    }
}
```

### Java

```c
    private static final int BUCKET_SIZE = 10;
    public static void bucketSort(int[] array) {
        int max = findMax(array);
        List<List<Integer>> buckets = new ArrayList<>(BUCKET_SIZE);

        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : array) {
            int index = num * BUCKET_SIZE / (max + 1);
            buckets.get(index).add(num);
        }

        int idx = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                array[idx++] = num;
            }
        }
    }
```

### Python

```c
def bucket_sort(array):
    max_val = max(array)
    bucket_size = 10
    buckets = [[] for _ in range(bucket_size)]

    for num in array:
        index = num * bucket_size // (max_val + 1)
        buckets[index].append(num)

    sorted_array = []
    for bucket in buckets:
        sorted_array.extend(sorted(bucket))

    return sorted_array
```

## Advantages and Disadvantages

### Advantages:
1. Efficiency with Uniform Distribution: Performs well with uniformly distributed data.
2. Stable Sorting: If the sorting algorithm used for the buckets is stable, Bucket Sort will be stable.

### Disadvantages:
1. Not Suitable for All Data Distributions: Performance degrades with non-uniformly distributed data.
2. Space Complexity: Requires additional space for buckets.
3. Overhead for Sorting Buckets: If the number of buckets is not chosen well, it can lead to inefficiencies.
