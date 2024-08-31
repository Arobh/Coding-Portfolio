class Item:
    def __init__(self, weight, value):
        self.weight = weight
        self.value = value

def fractional_knapsack(W, items):
    items.sort(key=lambda x: x.value / x.weight, reverse=True)
    max_value = 0.0

    for item in items:
        if W == 0:
            break
        if item.weight <= W:
            W -= item.weight
            max_value += item.value
        else:
            max_value += item.value * (W / item.weight)
            W = 0

    return max_value

items = [Item(60, 100), Item(100, 120), Item(120, 240)]
W = 50
print(f"Maximum value we can obtain = {fractional_knapsack(W, items):.2f}")
