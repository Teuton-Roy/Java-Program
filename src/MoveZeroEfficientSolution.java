import java.util.Scanner;

public class MoveZeroEfficientSolution {
    public static void moveZeros(int[] Arr, int n)
    {
        int nonZero = 0;
        for(int i=0; i<n; i++){
            if(Arr[i]!=0){
                int temp;
                temp = Arr[nonZero];
                Arr[nonZero] = Arr[i];
                Arr[i] = temp;

                nonZero++;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<n; i++){
            Arr[i] = sc.nextInt();
        }

        System.out.println("Before move zero from array: ");
        for (int i=0; i<n; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();

        moveZeros(Arr, n);
        System.out.println("After move zero from array: ");
        for (int i=0; i<n; i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
