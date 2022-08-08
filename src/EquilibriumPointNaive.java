import java.util.Scanner;

public class EquilibriumPointNaive {
    public static boolean checkEquilibrium(int[] arr, int n)
    {
        for (int i=0; i<n; i++)
        {
            int left_sum = 0;
            int right_sum = 0;

            for (int j = 0; j < i; j++)
                left_sum += arr[j];

            for (int j = i + 1; j < n; j++)
                right_sum += arr[j];

            if (left_sum == right_sum)
                return true;
        }
        return false;
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

        System.out.println("Equilibrium point: "+checkEquilibrium(arr,n));
    }
}
