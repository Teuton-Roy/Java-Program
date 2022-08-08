import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int n, int target){
        //Initialize//
        int start = 0;
        int end = n-1;
        int mid = start + (end-start) / 2;

        //Traverse//
        while(start <= end){
            if (arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            mid = start + (end-start) / 2;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you wants: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int key;
        System.out.println("Enter search value: ");
        key = sc.nextInt();

        n=binarySearch(arr,n,key);
        System.out.println("Element exist at index: "+n);
    }
}
