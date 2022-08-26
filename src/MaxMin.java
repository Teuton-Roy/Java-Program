import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
            if(arr[i] < min){
                min = arr[i];
                count++;
            }
        }
        System.out.println(count);


    }
}
