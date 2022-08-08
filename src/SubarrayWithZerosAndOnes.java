import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWithZerosAndOnes {
    public static int largestZerosOnesSubarray(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int max = 0;
        for (int i=0; i<n; i++){
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        for (int i=0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            }
            else{
                if (map.get(sum) != null){
                    max = Math.max(max, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        System.out.println("1 = Sub array with sum zero AND 0 = No Sub array with sum zero.");
        System.out.println(largestZerosOnesSubarray(arr, n));
    }
}
