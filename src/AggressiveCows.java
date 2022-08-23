import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static int findAggressiveCow(int[] arr, int n, int K){
        Arrays.sort(arr);

        int start = 0;
        int max = -1;

        for (int i=0; i<n; i++){
            max = Math.max(max,arr[i]);
        }

        int end = max;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if(isPossibleSolution(arr, n, K, mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static boolean isPossibleSolution(int[] arr, int n, int K, int mid){

        int Count_cow = 1;
        int lastpos = arr[0];

        for (int i = 0; i < n; i++) {

            if(arr[i] - lastpos >= mid){
                Count_cow ++;
                if(Count_cow == K){
                    return true;
                }
                lastpos = arr[i];
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many stall you want: ");
        n = sc.nextInt();

        int[] stall = new int[n];
        System.out.println("Enter the position of the stalls: ");
        for (int i = 0; i < n; i++) {
            stall[i] = sc.nextInt();
        }

        int cow;
        System.out.println("Enter how many cows you want to assign: ");
        cow = sc.nextInt();

        System.out.println();

        System.out.println("Largest maximum distance between the stalls: "+findAggressiveCow(stall, n, cow));
    }
}
