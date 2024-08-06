#include <iostream>
#include <vector>
#include <algorithm>

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

int main() {
    std::vector<int> array = {4, 2, 2, 8, 3, 3, 1};

    countingSort(array);

    std::cout << "Sorted array: ";
    for (int num : array) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
