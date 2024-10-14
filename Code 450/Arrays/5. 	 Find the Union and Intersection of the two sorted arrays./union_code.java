

//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)  s.add(a[i]);
        for(int j=0;j<m;j++)  s.add(b[j]);
        return s.size();
    }
}
