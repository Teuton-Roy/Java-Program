import java.util.Scanner;

public class LeftRotateDplaceThirdMethod {
    //Using Reversal Algorithm//

    public static void leftRotated(int[] arr, int d, int n){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many element you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before rotate d place: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int d;
        System.out.println("Enter the D:");
        d = sc.nextInt();

        leftRotated(arr, d, n);
        System.out.println("After rotate d place: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

