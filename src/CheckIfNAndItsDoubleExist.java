import java.util.Scanner;

public interface CheckIfNAndItsDoubleExist {
    static boolean CheckIfExist(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j){
                    continue;
                }
                if (arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    static void main(String[] args){
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
        System.out.println("N and it's double exist: " +CheckIfExist(arr, n));
    }
}
