import java.util.Scanner;

public class swapAlternate {
    public static void swapAlternate(int[] arr, int n)
    {
        for(int i=0; i<n; i=i+2)
        {
            if(i+1 < n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before swap alternate array is:  ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        swapAlternate(arr, n);
        System.out.println("After swap alternate array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
