class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< nums1.length; i++){
            ans.add(nums1[i]);
        }
        for(int i =0; i < nums2.length; i++){
            if(ans.contains(nums2[i])){
                list.add(nums2[i]);
                ans.remove(nums2[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0; i< arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
