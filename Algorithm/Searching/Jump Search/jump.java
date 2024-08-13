public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int size = arr.length;
        int step = (int) Math.sqrt(size);
        int prev = 0;

        while (arr[Math.min(step, size) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(size);
            if (prev >= size) {
                return -1; // Target not found
            }
        }

        for (int i = prev; i < Math.min(step, size); i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        int result = jumpSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
