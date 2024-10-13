// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int max=Integer.MIN_VALUE;
        for(int i: arr) max=Math.max(max,i);
        int freq[]=new int[max+1];
        for(int i: arr) freq[i]++;
        int count=0;
        for(int i=0;i<max+1;i++){
            if(freq[i]!=0){
                count+=freq[i];
                if(count>=k)    return i;
            }
        }
        return -1; 
    }
}
