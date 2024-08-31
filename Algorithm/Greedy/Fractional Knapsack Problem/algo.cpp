#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Item {
    int weight;
    int value;
};

bool cmp(Item a, Item b) {
    double r1 = (double)a.value / a.weight;
    double r2 = (double)b.value / b.weight;
    return r1 > r2;
}

double fractionalKnapsack(int W, vector<Item>& items) {
    sort(items.begin(), items.end(), cmp);

    double maxValue = 0.0;
    for (const auto& item : items) {
        if (W == 0) break;
        if (item.weight <= W) {
            W -= item.weight;
            maxValue += item.value;
        } else {
            maxValue += item.value * ((double)W / item.weight);
            W = 0;
        }
    }
    return maxValue;
}

int main() {
    vector<Item> items = {{60, 100}, {100, 120}, {120, 240}};
    int W = 50;
    cout << "Maximum value we can obtain = " << fractionalKnapsack(W, items) << endl;
    return 0;
}
