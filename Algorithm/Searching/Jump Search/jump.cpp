#include <iostream>
#include <cmath>
using namespace std;

int jumpSearch(int arr[], int size, int target) {
    int step = sqrt(size);
    int prev = 0;

    while (arr[min(step, size) - 1] < target) {
        prev = step;
        step += sqrt(size);
        if (prev >= size) {
            return -1; // Target not found
        }
    }

    for (int i = prev; i < min(step, size); i++) {
        if (arr[i] == target) {
            return i; // Target found at index i
        }
    }

    return -1; // Target not found
}

int main() {
    int arr[] = {1, 3, 5, 7, 9, 11, 13, 15};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target = 9;
    int result = jumpSearch(arr, size, target);

    if (result != -1) {
        cout << "Element found at index " << result << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}
