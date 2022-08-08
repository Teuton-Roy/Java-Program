import java.util.Scanner;

public class StrongestNeighbour {
    public static void MaximumAdjacent(int[] arr, int n)
    {
        for (int i=0; i<n-1; i++)
            System.out.print(Math.max(arr[i], arr[i+1])+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before finding strongest neighbour: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Strongest Neighbours are: ");
        MaximumAdjacent(arr, n);
    }
}
