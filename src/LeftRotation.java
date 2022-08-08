import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args)
    {
        //Introduction//
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr = new int[50];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++)
        {
            Arr[i] = sc.nextInt();
        }

        int temp = Arr[0];
        for(int i=1; i<n; i++){
            Arr[i-1] = Arr[i];
        }
        Arr[n-1] = temp;

        System.out.println("After Left-Rotation the array is: ");
        for(int i=0; i<n; i++){
        System.out.print(Arr[i]+" ");
        }
    }
}
