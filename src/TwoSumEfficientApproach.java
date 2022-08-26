import java.util.HashMap;
import java.util.Scanner;

public class TwoSumEfficientApproach {
    public static int[] Twosum(int[] arr, int target){

        //create hashmap//
        HashMap<Integer, Integer> map = new HashMap<>();

        //Insert//
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        //Searching//
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int rem = target - num;

            if(map.containsKey(rem)){
                int index = map.get(rem);

                if(index == i){
                    continue;
                }
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many element you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }

        int target;
        System.out.println("Enter the target elements: ");
        target = sc.nextInt();

        System.out.println();

        int[] temp = Twosum(arr, target);
        for (int element: temp
             ) {
            System.out.println(element+" ");
        }
    }
}
