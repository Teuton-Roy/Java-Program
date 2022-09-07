import java.util.Scanner;

public class ShellSort {
    public static void Shall_Sort(int[] arr, int n){
        for (int i = n/2; i > 0; i /= 2) {
            for (int j = i; j < n; j++) {
                int temp = arr[j];

                int k;
                for (k = j; k >= i && arr[k - i] > temp; k -= i) {
                    arr[k] = arr[k - i];
                }
                arr[k] = temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        Shall_Sort(arr,n);
        System.out.println("Array after shell sort: ");
        for (int elements: arr) {
            System.out.print(elements+" ");
        }
    }
}
