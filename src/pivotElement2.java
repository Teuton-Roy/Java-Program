//Find pivot in sorted rotated array//
//3 4 5 6 7 0 1 2//
// Pivot Element : From where are next numbers are ascending. So, 7 is pivot element//


import java.util.Scanner;

public class pivotElement2 {
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start)/2;

        while(start <= end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
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

        n = findPivot(arr);
        System.out.println("Pivot element is at index: "+n);
    }
}

