import java.util.Scanner;

public class ThreeSum {
    public static int[] threeSum(int[] arr){
        int[] temp = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == 0){
                        temp[0] = arr[i];
                        temp[1] = arr[j];
                        temp[2] = arr[k];
                    }
                }
            }
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        int[] temp = threeSum(arr);
        for (int element: temp) {
            System.out.println(element+" ");
        }
    }
}
