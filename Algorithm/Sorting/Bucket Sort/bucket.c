#include <stdio.h>
#include <stdlib.h>

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

int main() {
    int array[] = {42, 32, 33, 52, 37, 47, 51};
    int size = sizeof(array) / sizeof(array[0]);

    bucketSort(array, size);

    printf("Sorted array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

    return 0;
}
