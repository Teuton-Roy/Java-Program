import java.util.Scanner;

public class PivotElement {
    public static int getPivot(int[] arr, int n){
        int start = 0;
        int end = n-1;
        int mid = start + (end - start) / 2;

        while(start < end){
            if(arr[mid] >= arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return arr[end];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n =  sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        n = getPivot(arr,n);
        System.out.println("The Pivot Elements At Index: "+n);
    }
}
