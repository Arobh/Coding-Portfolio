// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(i==0||arr[i-1]!=x)   ans.add(i);
                if(i==arr.length-1||arr[i+1]!=x)    ans.add(i);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
}
