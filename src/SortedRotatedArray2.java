//Here pivot is the biggest element in this array//
//Here one case handel, that is: If, our array is not rotated//

import java.util.Scanner;

public class SortedRotatedArray2 {

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
    public static int binarySearch(int[] arr, int target, int start, int end){
        //Initialize//
//        int start = 0;
//        int end = n-1;
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

    //Search the target Element//
    public static int Search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){  //if not find any pivot element//
            //pivot = nums.length-1;
            return binarySearch(nums, target, 0,nums.length-1);
        }
        if(nums[pivot] == target){ //when pivot is the target//
            return pivot;
        }
        if(target >= nums[0]){ // when target is greater and equal than 1st element//
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot, nums.length-1); // when target is less and equal than 1st element//
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter target:");
        target = sc.nextInt();

        n = Search(arr,target);
        System.out.println(n);
    }
}
