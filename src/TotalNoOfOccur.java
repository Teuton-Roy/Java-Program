import java.util.Scanner;

public class TotalNoOfOccur {
    public static int searchRange(int[] nums, int target) {

        //for first occurence of the target//

        int start = 0;
        int end = nums.length-1;
        int first_occur = -1;

        while(start<=end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                first_occur = mid;
                end = mid-1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
        }

        //for last occurence of the target//

        start = 0;
        end = nums.length-1;
        int last_occur = -1;

        while(start<=end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                last_occur  = mid;
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
        }
        return (last_occur - first_occur) + 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for (int i=0; i<n; i++){
//            (() (arr[i] = scc))
            arr[i] = sc.nextInt();
        }
        int key;
        System.out.println("Enter key element: ");
        key = sc.nextInt();

        n  = searchRange(arr,key);
        System.out.println("Number of occurrence key value is: "+n);
    }
}


