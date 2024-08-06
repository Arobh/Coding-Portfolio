#include <iostream>
#include <vector>
#include <algorithm>

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

int main() {
    std::vector<int> array = {42, 32, 33, 52, 37, 47, 51};

    bucketSort(array);

    std::cout << "Sorted array: ";
    for (int num : array) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
