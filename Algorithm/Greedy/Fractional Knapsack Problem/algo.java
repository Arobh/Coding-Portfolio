import java.util.Arrays;

class Item implements Comparable<Item> {
    int weight, value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int compareTo(Item o) {
        double r1 = (double) this.value / this.weight;
        double r2 = (double) o.value / o.weight;
        return Double.compare(r2, r1);
    }
}

public class FractionalKnapsack {

    public static double fractionalKnapsack(int W, Item[] items) {
        Arrays.sort(items);
        double maxValue = 0.0;

        for (Item item : items) {
            if (W == 0) break;
            if (item.weight <= W) {
                W -= item.weight;
                maxValue += item.value;
            } else {
                maxValue += item.value * ((double) W / item.weight);
                W = 0;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Item[] items = {new Item(60, 100), new Item(100, 120), new Item(120, 240)};
        int W = 50;
        System.out.println("Maximum value we can obtain = " + fractionalKnapsack(W, items));
    }
}
