// User function Template for Java
class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int min=arr[n-1]-arr[0];
        int x=0,y=0;
        int small=arr[0]+k;
        int large=arr[n-1]-k;
        for(int i=0;i<n-1;i++){
            x=Math.min(small,arr[i+1]-k);
            y=Math.max(large,arr[i]+k);
            if(x<0) continue;
            min=Math.min(min,y-x);
        }
        return  min;
    }
}
