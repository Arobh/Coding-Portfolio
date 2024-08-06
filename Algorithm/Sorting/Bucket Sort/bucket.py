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

if __name__ == "__main__":
    array = [42, 32, 33, 52, 37, 47, 51]

    sorted_array = bucket_sort(array)

    print("Sorted array:", sorted_array)
