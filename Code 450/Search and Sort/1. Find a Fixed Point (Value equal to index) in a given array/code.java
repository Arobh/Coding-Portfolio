// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.size();i++)
            if(nums.get(i-1)==i)    ans.add(i);
        return ans;
    }
}
