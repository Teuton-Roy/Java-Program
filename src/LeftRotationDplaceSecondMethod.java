import java.util.Scanner;

//Using a temp  array//

public class LeftRotationDplaceSecondMethod {
    public static void leftRotate(int[] A, int d, int n)
    {
        int[]  temp = new int[d]; //take a temp array size of d//
        for(int i=0; i<d; i++){
            temp[i] = A[i];  //copy main array's element till d//
        }

        for(int i=d; i<n; i++){
             A[i-d] = A[i]; // i start with d, and At A[i-d] place store the A[i] element's//
         }

         for (int i=0; i<d; i++){
             A[n-d+i] = temp[i];  // i=0 to i<d and at A[n-d+i] place store temp[i] element's//
         }
    }

    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("before rotate by d place: ");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();

        int d;
        System.out.println("Enter the D:");
        d = sc.nextInt();

        leftRotate(A,d,n);
        System.out.println("After rotate by d place: ");
        for (int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }
}
