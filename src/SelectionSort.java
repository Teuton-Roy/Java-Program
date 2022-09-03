import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            //find the max element in the remaining array and swap it with correct index//

            int last = arr.length  - i - 1;
            int max = getMax(arr, 0, last);

            //swap it with correct index//
            swap(arr, max, last);
        }
    }
    public static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //Main Function//
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter how many number you want: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        selectionSort(arr);
        System.out.println("Array after selection sort: ");
        for (int elements : arr) {
            System.out.print(elements+ " ");
        }
    }
}
