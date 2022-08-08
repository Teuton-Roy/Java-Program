import java.util.Scanner;

public class ReverseElements {
    public static void Reverse(int[] A, int n){
        int low=0;
        int high = n-1;

        while (low<high){
            int temp = A[low];

            A[low] = A[high];

            A[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Before Reverse the elements is: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }

        System.out.println();

        Reverse(A,n);
        System.out.println("After Reverse the elements is: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
}
