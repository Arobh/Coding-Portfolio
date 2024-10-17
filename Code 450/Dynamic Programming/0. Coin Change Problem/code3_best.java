// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long dp[]=new long[sum+1];
        dp[0]=1;
        for(int i=0;i<N;i++){
            for(int j=coins[i];j<=sum;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[sum];
    }
}
