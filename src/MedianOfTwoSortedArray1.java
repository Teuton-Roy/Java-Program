import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArray1 {
    public static double MedianOfArray(int[] a1, int n, int[] a2, int m){

        int[] temp = new int[n+m];

//        if (n >= 0) System.arraycopy(a1, 0, temp, 0, n);
//        for (int i = 0; i < m; i++) {
//            temp[n+i] = a2[i];
//        }

        if (n >= 0) System.arraycopy(a1, 0, temp, 0, n);
        if (m >= 0) System.arraycopy(a2, 0, temp, n, m);

        Arrays.sort(temp);
        double median;

        if(temp.length % 2 != 0){
            median = temp[temp.length/2];
        }
        else{
            median = (double) ((temp[temp.length/2]) + (temp[temp.length/2 - 1])) / 2.0;
        }
        return median;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m;
        System.out.println("Enter how many elements you want: ");
        m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println();

//       int[] temp = MedianOfArray(arr1, n, arr2, m);
//        for (int elements : temp) {
//            System.out.println(elements + " ");
//        }

        System.out.println("Median of this two arrays is: "+MedianOfArray(arr1, n, arr2, m));
    }
}
