import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    private static final int BUCKET_SIZE = 10;

    public static void bucketSort(int[] array) {
        int max = findMax(array);
        List<List<Integer>> buckets = new ArrayList<>(BUCKET_SIZE);

        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : array) {
            int index = num * BUCKET_SIZE / (max + 1);
            buckets.get(index).add(num);
        }

        int idx = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                array[idx++] = num;
            }
        }
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {42, 32, 33, 52, 37, 47, 51};

        bucketSort(array);

        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
