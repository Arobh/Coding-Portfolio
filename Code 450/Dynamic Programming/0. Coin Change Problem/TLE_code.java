// User function Template for Java

class Solution {
    long ans=0;
    public long count(int coins[], int N, int sum) {
        // code here
        for(int i=0;i<coins.length;i++){
            help(coins[i],sum-coins[i],coins,i);
        }
        return ans;
    }
    public void help(int x,int sum,int[] arr,int j){
        if(sum<0)   return;
        if(sum==0){
            ans++;
            return ;
        }
        for(int i=j;i<arr.length;i++){
            help(x+arr[i],sum-arr[i],arr,i);
        }
    }
}
