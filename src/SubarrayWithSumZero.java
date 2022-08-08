import java.util.Scanner;

public class SubarrayWithSumZero {
    public static boolean isSum(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int current_sum = 0;
            for (int j = i; j < n; j++) {
                current_sum += arr[j];
                if (current_sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you wants: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isSum(arr,n));
    }
}

