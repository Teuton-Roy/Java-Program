import java.util.Scanner;

public class FirstOccurrence {
    public static int First(int[] arr, int x, int low, int high, int n)
    {
        while(high >= low)
        {
            int mid=(low+high)/2;
            if((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;

            else if (x > arr[mid]) {
                return First(arr, (mid+1), high, x ,n);
            }
            else {
                return  First(arr, low, (mid-1) ,x  ,n);
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int x;
        System.out.println("Enter which element you find:");
        x = sc.nextInt();

        n = First(arr,x,0,n-1,n);
        System.out.println("First Occurrence of number is: "+n);
    }
}
