//import java.util.Scanner;
public class RadixSort {
    private int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
//        int max = arr[0];
        //throw exception using try and catch if array is empty//
        try {
            for (int j : arr) {
                if (j > max) {
                    max = j;
                }
            }
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//        }
        return max;
    }

    /*
     * This method implements the counting sort algorithm according to the digit represented by exp.
     * @param arr The array to be sorted
     * @param exp The exponent to be used in the counting sort algorithm
     */
    private void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int j : arr) {
            count[(j / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    public void radixSort(int[] arr) {
        // Find the maximum number to know number of digits
        int max = getMax(arr);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    //Removing Main function for testing purposes//

     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        System.out.println("Enter how many number you want: ");
//        n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        RadixSort rs = new RadixSort();
//        rs.radixSort(arr);
//
//        System.out.println("Sorted array: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }

         RadixSort rs = new RadixSort();
         int[] arr = { };
         rs.radixSort(arr);
         for (int j : arr) {
             System.out.print(j + " ");
         }
     }
 }

