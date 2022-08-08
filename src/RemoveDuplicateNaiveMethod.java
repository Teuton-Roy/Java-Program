import java.util.Scanner;

public class RemoveDuplicateNaiveMethod {
    public static int removeDuplicates(int[] A, int n)
    {
        int[] temp = new int[n];
        temp[0] = A[0];
        int res = 1;

        for (int i=1; i<n; i++){
            if(temp[res-1] != A[i]){
                temp[res] = A[i];
                res++;
            }
        }
        for (int i = 0; i<res ; i++)
        {
            A[i] = temp[i];
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Before Remove Duplicate value the array is: ");
        for (int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();

        n = removeDuplicates(A,n); //calling Function//
        System.out.println("After Remove duplicate value the array is: ");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}
