#include <stdio.h>
#include <stdlib.h>

struct Item {
    int weight;
    int value;
};

int cmp(const void *a, const void *b) {
    double r1 = (double)((struct Item*)a)->value / ((struct Item*)a)->weight;
    double r2 = (double)((struct Item*)b)->value / ((struct Item*)b)->weight;
    return r2 - r1 > 0 ? 1 : -1;
}

double fractionalKnapsack(int W, struct Item arr[], int n) {
    qsort(arr, n, sizeof(struct Item), cmp);

    double maxValue = 0.0;
    for (int i = 0; i < n; i++) {
        if (W == 0) break;
        if (arr[i].weight <= W) {
            W -= arr[i].weight;
            maxValue += arr[i].value;
        } else {
            maxValue += arr[i].value * ((double)W / arr[i].weight);
            W = 0;
        }
    }
    return maxValue;
}

int main() {
    struct Item arr[] = {{60, 100}, {100, 120}, {120, 240}};
    int W = 50;
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Maximum value we can obtain = %.2f\n", fractionalKnapsack(W, arr, n));
    return 0;
}
