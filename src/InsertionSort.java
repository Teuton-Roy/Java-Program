import java.util.Scanner;

public class InsertionSort {
    public static void InsertionSorting(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) //Because 2nd loop Start from index 1 and sort till (1 to 0)//
            {
                for (int j = i+1; j > 0; j--) {
                    if(nums[j] < nums[j-1]){
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }
                    else{
                        break; //Because, when element j not smaller than (j-1), then break//
                    }
                }

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many numbers you wants: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter arrays element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        InsertionSorting(arr);
        System.out.println("After the Insertion sort: ");
        for (int elements: arr) {
            System.out.print(elements+" ");
        }
    }
}

