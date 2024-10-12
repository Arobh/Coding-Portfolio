// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i: arr){
            pq.add(i);
        }
        int ans=0;
        for(int i=0;i<k;i++){
            ans=pq.poll();
        }
        return ans;
    }
}
