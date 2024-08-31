class Item {
    constructor(weight, value) {
        this.weight = weight;
        this.value = value;
    }
}

function fractionalKnapsack(W, items) {
    items.sort((a, b) => (b.value / b.weight) - (a.value / a.weight));
    let maxValue = 0;

    for (let item of items) {
        if (W === 0) break;
        if (item.weight <= W) {
            W -= item.weight;
            maxValue += item.value;
        } else {
            maxValue += item.value * (W / item.weight);
            W = 0;
        }
    }
    return maxValue;
}

let items = [new Item(60, 100), new Item(100, 120), new Item(120, 240)];
let W = 50;
console.log("Maximum value we can obtain =", fractionalKnapsack(W, items));
