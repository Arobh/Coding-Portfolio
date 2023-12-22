import java.util.Scanner;
public class Bubble_Sort {
    void bubble(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
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
        Bubble_Sort obj=new Bubble_Sort();
        obj.bubble(arr,n);
        System.out.println("\nAfter Sorting the elements of array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
