import java.util.*;

public class SingleElementInASortedArray {
    public static int SingleNonDuplicate(int[] nums){
        int start = 0;
        int end = nums.length - 2;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if(mid % 2 == 0){
                if(nums[mid] != nums[mid+1]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(nums[mid] == nums[mid+1]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            mid = start + (end - start) / 2;
        }
        return nums[start];
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

        n = SingleNonDuplicate(arr);
        System.out.println("The Single element that appear exactly one time: "+n);
    }
}
