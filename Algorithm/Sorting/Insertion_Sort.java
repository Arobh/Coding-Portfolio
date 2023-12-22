import java.util.Scanner;

public class Insertion_Sort {
    void inserion(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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
        Insertion_Sort obj=new Insertion_Sort();
        obj.inserion(arr,n);
        System.out.println("\nAfter Sorting the elements of array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
