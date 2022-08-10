import java.util.Scanner;

public class FindPairWithGivenSum {
    public static boolean isPair(int[] arr, int n, int target){
        int left = 0;
        int right = n-1;

        while(left <= right){
            if(arr[left]+arr[right] == target){
                return true;
            }
            else if (arr[left] + arr[right] > target) {
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter the target: ");
        target = sc.nextInt();

        System.out.println();
        System.out.println(isPair(arr, n, target));
    }
}
