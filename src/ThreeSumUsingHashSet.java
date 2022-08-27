import java.util.*;

public class ThreeSumUsingHashSet {
    public static List<List<Integer>> ThreeSum(int[] arr){
        //creating hashset//
        Set<List<Integer>> res = new HashSet<>();

        if(arr.length == 0){
            return new ArrayList<>(res);
        }

        Arrays.sort(arr);
        // i goes till n-2 because we need to make pair for three sum//
        for (int i=0; i<arr.length-2; i++){

            int left = i+1;
            int right = arr.length-1;

            while(left < right){
                int Twosum = arr[left] + arr[right];

                if(Twosum == -arr[i]){
                    //as.List() = This methods use for return fixed size array//
                        res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    {
                        left++;
                        right--;
                    }
                }
                else if (Twosum < -arr[i]) {
                    left++;
                }
                else if (Twosum > -arr[i]) {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
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

        System.out.println();

        //This is the return method for List<List<Integer>>//
        List<List<Integer>> temp = ThreeSum(arr);
        for (List<Integer> element: temp) {
            System.out.println(element+" ");
        }
    }
}
