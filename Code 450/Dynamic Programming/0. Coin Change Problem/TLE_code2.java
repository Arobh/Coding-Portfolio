// User function Template for Java

class Solution {
    public long count(int coins[], int n, int sum) {
        // code here.
        if(sum==0)  return 1;
        if(sum<0)   return 0;
        if(n<=0)    return 0;
        return count(coins,n-1,sum)+count(coins,n,sum-coins[n-1]);
    }
}
