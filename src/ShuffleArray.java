import java.util.Scanner;

public class ShuffleArray {
    public static int[] Shuffle(int[] arr, int n)
    {
        int[] ans = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            if(i % 2 == 0)
            {
                ans[i] = arr[i / 2];
            }
            else{
                ans[i] = arr[n + i /2];
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k;
        System.out.println("Enter k: ");
        k = sc.nextInt();

        int[] arr2 = new int[arr.length];
        arr2 = Shuffle(arr, k);
        System.out.println("Shuffle array is: ");
        for (int x: arr2){
            System.out.print(x+" ");
        }
    }
}
