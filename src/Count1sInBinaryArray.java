import java.util.Scanner;

public class Count1sInBinaryArray {
    public static int countOnes(int[] arr, int n){
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == 0){
                start = mid+1;
            }
            else {
                if (mid == 0 || arr[mid-1] != arr[mid]){
                    return (n-mid);
                }
                else{
                    end = mid-1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args){
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
        n = countOnes(arr,n);
        System.out.println("Number of One's is: "+n);
    }
}
