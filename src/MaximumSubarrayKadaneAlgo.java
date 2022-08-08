import java.util.Scanner;

public class MaximumSubarrayKadaneAlgo {
    public static int maxSubarray(int[] arr, int n)
    {
        int maximum_sum = arr[0];
        int maxEnding = arr[0];

        for (int i=0; i<n; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
            maximum_sum = Math.max(maxEnding, maximum_sum);
        }

        return maximum_sum;
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
