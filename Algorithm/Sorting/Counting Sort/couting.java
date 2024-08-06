import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        // Count occurrences of each value
        for (int num : array) {
            count[num - min]++;
        }

        // Compute cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};

        countingSort(array);

        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
