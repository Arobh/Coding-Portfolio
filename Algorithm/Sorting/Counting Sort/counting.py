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

if __name__ == "__main__":
    array = [4, 2, 2, 8, 3, 3, 1]

    sorted_array = counting_sort(array)

    print("Sorted array:", sorted_array)
