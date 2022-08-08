import java.util.Scanner;

public class ReverseInGroup {
    public static void ReverseGroup(int[] arr, int n, int k)
    {
        int low = 0;
        int high = k-1;

        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        int low2 = k;
        int high2 = n-1;

        while(low2<high2){
            int temp2 = arr[low2];
            arr[low2] = arr[high2];
            arr[high2] = temp2;

            low2++;
            high2--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements want: ");
        n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.println("Enter k: ");
        k = sc.nextInt();

        System.out.println("Before reverse in group: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ReverseGroup(arr, n, k);
        System.out.println();

        System.out.println("After reverse in group: ");
        for (int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
