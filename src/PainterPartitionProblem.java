import java.util.*;

public class PainterPartitionProblem {
    public static int findPainters(int[] arr, int n, int K){
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int end = sum;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end){
            if(isPossibleSolution(arr, n, K, mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static boolean isPossibleSolution(int[] arr, int n, int K, int mid){
        int painterCount = 1;
        int Boardsum = 0;

        for (int i = 0; i < n; i++) {
            if (Boardsum + arr[i] <= mid){
                Boardsum += arr[i];
            }
            else {
                painterCount++;
                if(painterCount > K || arr[i] > mid){
                    return false;
                }
                Boardsum = arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int painter;
        System.out.println("Enter how many painters you want: ");
        painter = sc.nextInt();

        System.out.println();
        System.out.println("The minimum time to paints all the board: "+findPainters(arr, n, painter));
    }
}
