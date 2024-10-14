class Solution {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i > j)    return false;
            j = Math.max(j, i + arr[i]);
        }
        return true;
    }
}
