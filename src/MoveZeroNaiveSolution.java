import java.util.Scanner;

public class MoveZeroNaiveSolution {

    public static void movezero(int[] A, int n)
    {
        for (int i=0; i<n; i++){
            if(A[i]==0){
                for (int j=i+1;j<n; j++){
                    if(A[j]!=0) {
                        int temp;
                        temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Before remove zeros form array: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();

        movezero(A,n);
        System.out.println("After remove zeros from array: ");
        for (int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
   }
}

