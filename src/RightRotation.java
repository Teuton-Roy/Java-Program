import java.util.Scanner;

public class RightRotation {
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

        int temp = Arr[n-1];
        for(int i=n; i>0; i--){
            Arr[i] = Arr[i-1];
        }
        Arr[0] = temp;

        System.out.println("After Right-Rotation the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
