import java.util.Scanner;

public class MaximumDistanceBetweenAPairOfValues {
    public static int diff(int[] nums1, int[] nums2){
        int distance = 0;

        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;)
            if (nums1[i] <= nums2[j])
                distance = Math.max(distance, j++ - i);
            else
                i++;

        return distance;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many element you want in 1st array: ");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter 1st array elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m;
        System.out.println("Enter how many elements you want in 2nd array: ");
        m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter 2nd array elements: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println();
        n = diff(arr1, arr2);
        System.out.println("Maximum distance between pair of values: "+n);
    }
}
