import java.util.Scanner;

public class MinimumAdjacentDifference {
    public static int minAdjDiff(int[] arr, int n) {
        //int ans = 0;
        int last_element = Math.abs(arr[n - 1] - arr[0]);
        for (int i = 0; i<n-1; i++) {

            last_element = Math.min(Math.abs(arr[i+1] - arr[i]), last_element);
        }
        return last_element;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            Arr[i] = sc.nextInt();
        }

        n = minAdjDiff(Arr, n);
        System.out.print("Minimum Adjacent Difference in a circular Array is:"+n);
    }
}

