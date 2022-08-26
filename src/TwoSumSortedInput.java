import java.util.Scanner;

public class TwoSumSortedInput {
    public static int[] twoSum_2(int[] numbers, int target) {
        //Binary Search//

        for (int i = 0; i < numbers.length; i++) {

            int start = i + 1;
            int end = numbers.length - 1;
            int mid = start + (end - start) / 2;

            while (start <= end) {
                int rem = target - numbers[i];

                if (numbers[mid] == rem) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > rem) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = start + (end - start) / 2;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many element you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter target: ");
        target = sc.nextInt();

        System.out.println();

        int[] temp = twoSum_2(arr, target);
        for (int element: temp
             ) {
            System.out.println(element+" ");
        }
    }
}
