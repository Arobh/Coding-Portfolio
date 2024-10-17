
// User function Template for Java

class Solution {
    public long count(int coins[], int n, int sum) {
        // code here.
       long dp[][]=new long[n+1][sum+1];
       for(long d[]: dp)   Arrays.fill(d,-1);
       return help(coins,n,sum,dp);
    }
    public long help(int coins[], int n, int sum,long[][] dp){
        if(n<=0)    return 0;
        if(sum==0)  return  dp[n][sum]=1;
        if(sum<0)   return 0;
        if(dp[n][sum]!=-1)  return dp[n][sum];
        return dp[n][sum]=help(coins,n-1,sum,dp)+help(coins,n,sum-coins[n-1],dp);
    }
}
