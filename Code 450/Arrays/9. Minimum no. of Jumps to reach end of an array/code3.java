class Solution {
    public boolean canJump(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        if (n == 1)    return true;
        if (nums[0] == 0)    return false;
        i = n - 1;
        while (i > 0) {
            if (nums[i - 1] > 0)    i--;
            else {
                j = i - 1;
                while (j >= 0 && nums[j] < i - j)    j--;
                if (j < 0)    return false;
                i = j;
            }
        }
        return true;
    }
}
