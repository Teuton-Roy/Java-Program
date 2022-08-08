import java.util.Scanner;

public class EquilibriumPointEfficient {
    public static boolean Equilibrium(int[] arr, int n)
    {
        int sum = 0;
        for (int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        int left_sum = 0;
        for (int i=0; i<n; i++)
        {
            if (left_sum == sum - arr[i])
                return true;

            left_sum += arr[i];
            sum -= arr[i];
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equilibrium Point: "+Equilibrium(arr,n));
    }
}

