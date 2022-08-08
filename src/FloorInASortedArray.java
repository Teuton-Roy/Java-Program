import java.util.Scanner;

public class FloorInASortedArray {
    public static int findFloor(long[] arr, int n, long x){
        int start = 0;
        int end = n-1;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if (arr[mid] > x)
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return end;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        long[] arr = new long[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int key;
        System.out.println("Enter the value: ");
        key = sc.nextInt();

        n = findFloor(arr, n, key);
        System.out.println("Index of value is: " +n);
    }
}
