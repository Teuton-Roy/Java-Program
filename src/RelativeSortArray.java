import java.util.Arrays;
import java.util.Scanner;

public class RelativeSortArray {
    public static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M)
    {
        //Your code here
        int k = 0;

        for(int i=0; i<M; i++){
            for(int j=i; j<N; j++){
                if(A1[j] == A2[i]){
                    int temp = A1[k];
                    A1[k] = A1[j];
                    A1[j] = temp;

                    k++;
                }
            }
        }
        Arrays.sort(A1, k, N);
        return A1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want in array_1: ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter array_1 elements: ");
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int m;
        System.out.println("Enter array_2 elements: ");
        m= sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter array_2 elements: ");
        for (int i=0; i<m; i++)
        {
            arr2[i] = sc.nextInt();
        }

        arr1=sortA1ByA2(arr1, n, arr2, m);
        System.out.println("Array after sorting: ");
        for (int x: arr1) {
            System.out.print(x+" ");
        }
    }
}

