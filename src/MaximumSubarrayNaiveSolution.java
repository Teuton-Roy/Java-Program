import java.util.Scanner;

public class MaximumSubarrayNaiveSolution {
    public static int maxSubarray(int[] arr, int n)
    {
        int max_sum = arr[0];

        for (int i=0; i<n; i++){
            int current_sum = 0;
            for (int j=i; j<n; j++){
                current_sum = current_sum + arr[j];
                max_sum = Math.max(max_sum, current_sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        n= maxSubarray(arr, n);
        System.out.println("Maximum sum of sub-array is: "+n);
    }
}
