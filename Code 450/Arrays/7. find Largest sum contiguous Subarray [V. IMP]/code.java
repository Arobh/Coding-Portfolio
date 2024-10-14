// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        // Your code here
        int max=arr[0], n=arr.length;
        int sum=0;
        for(int i: arr){
            sum+=i;
            max=Math.max(max,sum);
            if(sum<0)    sum=0;
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0)    sum=0;
        }
        return max;
    }
}
