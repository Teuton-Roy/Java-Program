import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWithZeroEfficient {
    public static int ZeroSumSubarray(int[] arr, int n)
    {
        HashSet<Integer> set = new HashSet<>();

        int prefix_sum = 0;
        set.add(0);
        for (int i=0; i<n; i++){
            prefix_sum += arr[i];

            if (set.contains(prefix_sum) == true)
                return 1;

            set.add(prefix_sum);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("1 = Sub array with sum zero AND 0 = No Sub array with sum zero.");
        System.out.println(ZeroSumSubarray(arr,n));
    }
}
