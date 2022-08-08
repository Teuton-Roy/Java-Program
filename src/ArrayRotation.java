import java.util.Scanner;

public class ArrayRotation {
    public static void rotate(int[] numbs, int d, int n){

        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[(i+d)%n] = numbs[i];
        }

        for(int i=0; i<n; i++){
            numbs[i] = temp[i];
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        int n;
        System.out.println("Enter n");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before rotate: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int d;
        System.out.println("Enter the d: ");
        d = sc.nextInt();

        rotate(arr, d, n);
        System.out.println("After rotate: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
