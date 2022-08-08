import java.util.Scanner;

public class SearchInsertAtPosition {
    public static int insertPosition(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
            mid = start + (end - start) / 2;
        }
        return end + 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many numbers you wants: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter the target: ");
        target = sc.nextInt();

        System.out.println();

        n = insertPosition(arr,target);
        System.out.println("Insert Position at index: "+n);
    }
}
