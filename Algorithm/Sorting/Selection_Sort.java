import java.util.Scanner;
public class Selection_Sort{
    void selection(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n=scanf.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=scanf.nextInt();
        }
        scanf.close();
        System.out.println("You have entered the following elements of array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        Selection_Sort obj=new Selection_Sort();
        obj.selection(arr,n);
        System.out.println("\nAfter Sorting the elements of array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}