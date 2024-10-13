class Solution {
    public void sortColors(int[] arr) {
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
                continue;
            }
            if(arr[j]!=0){
                j--;
                continue;
            }
            arr[j]=arr[i];
            arr[i]=0;
            i++;
            j--;
        }
        i=0;
        j=arr.length-1;
        while(i<j){
            if(arr[j]==2){
                j--;
                continue;
            }
            if(arr[i]!=2){
                i++;
                continue;
            }
            arr[i]=arr[j];
            arr[j]=2;
            i++;
            j--;
        }
    }
}
