import java.util.HashSet;
import java.util.Scanner;

public class ElementInRange {
    public static boolean check_boolean(int[] arr, int n, int A, int B){
        HashSet<Integer> set = new HashSet<>();
        for (int x:arr) {
            set.add(x);
        }

        for (int i = A; i <= B; i++) {
            if (!set.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how want you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int A, B;
        System.out.println("Enter the range: ");
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(check_boolean(arr, n, A,B));
    }
}
