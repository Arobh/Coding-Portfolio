class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
              swap(nums,low,mid); 
              low++;
              mid++; 
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
               swap(nums,mid,high); 
                high--;
            }
        }
    }
    public void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
