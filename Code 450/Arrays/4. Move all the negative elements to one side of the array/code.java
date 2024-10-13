// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        Stack<Integer> pos=new Stack<>();
        Stack<Integer> neg=new Stack<>();
        for(int i=0;i<arr.length;i++)
            if(arr[i]<0)    neg.push(arr[i]);
            else    pos.push(arr[i]);
        int i=arr.length-1;
        while(!neg.isEmpty())    arr[i--]=neg.pop();
        while(!pos.isEmpty())   arr[i--]=pos.pop();
    }
}
