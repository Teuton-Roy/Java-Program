import java.util.HashSet;
import java.util.Scanner;

public class FindPairWithTripletSum {
    public static boolean Tri_sum(int[] A, int n, int x){
        for(int i=0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            int toFind = x - A[i];
            for (int j=i+1; j<n; j++){
                if(set.contains(toFind - A[j])){
                    return true;
                }
                set.add(A[j]);
            }
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enter target: ");
        target = sc.nextInt();

        System.out.println(Tri_sum(arr, n, target));
    }
}
