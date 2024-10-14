
class Solution {
    static int minJumps(int[] arr) {
        // your code here
        int n=arr.length;
        if(n<=1)    return 0;
        if(arr[0]==0)   return -1;
        int jumps = 1;  
        int maxReach = arr[0];
        int steps = arr[0];  // Number of steps we can still take in the current jump

        // Traverse the array
        for (int i = 1; i < n; i++) {
            // If we've reached the end of the array
            if (i == n - 1) return jumps;

            // Update the farthest point we can reach
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use one step to move forward
            steps--;

            // If no more steps are left, we must jump
            if (steps == 0) {
                jumps++;

                // If the current index is beyond the maxReach, we can't reach the end
                if (i >= maxReach) return -1;

                // Re-initialize the steps for the new jump
                steps = maxReach - i;
            }
        }

        return -1;
    }
}
