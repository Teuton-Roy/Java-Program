import java.util.Scanner;

public class TwoSumBoutForce {
    public static int[] twoSum(int[] arr, int target){
        int[] temp = new int[];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter the target sum: ");
        target = sc.nextInt();

        System.out.println();


        int[] temp = twoSum(arr,target);
        for (int element: temp) {
            System.out.println(element+" ");
        }
    }
}