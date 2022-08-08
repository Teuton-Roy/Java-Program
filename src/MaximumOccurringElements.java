import java.util.Scanner;

public class MaximumOccurringElements {
    public static int maxOcc(int[] L, int[] R, int n)
    {
        int[] arr = new int[1000];
        for (int i=0; i<n; i++)
        {
            arr[L[i]]++;
            arr[R[i]+1]--;
        }

        int maximum = arr[0];
        int res = 0;

        for (int i=1; i<1000; i++){
            arr[i] += arr[i-1];
            if (maximum < arr[i])
            {
                maximum = arr[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Introduction//
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter Left array elements: ");
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        System.out.println("Enter right array elements: ");
        for (int i=0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Left[] array elements are: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Right[] array elements are: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        n = maxOcc(arr1, arr2, n);
        System.out.println("Maximum Occurring Element is:" +n);
    }
}
