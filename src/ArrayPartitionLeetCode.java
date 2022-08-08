import java.util.Scanner;

public class ArrayPartitionLeetCode {
    public static int ArrayPairSum(int[] arr, int n)
    {
        //sort the array//
        int temp;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //now make pair between them and find the minimum//
        int sum = 0;
        for(int i=1; i<n; i=i+2){
            int mini = Math.min(arr[i-1], arr[i]);

            //now find the sum of minimum//
            sum = sum + mini;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many even number elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        n = ArrayPairSum(arr, n);
        System.out.print("Maximum of all sum: "+n);
    }
}
