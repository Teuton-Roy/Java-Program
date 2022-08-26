import java.util.Scanner;

public class TwoSumInputSortedTwoPointer {
    public static int[] TwoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left] + arr[right] == target){
                return new int[]{left+1, right+1};
            }
            else if(arr[left]+arr[right] > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter the target: ");
        target= sc.nextInt();

        System.out.println();

        int[] temp = TwoSum(arr,target);
        for (int element: temp) {
            System.out.println(element+" ");
        }
    }
}
