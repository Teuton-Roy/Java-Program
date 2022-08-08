import java.util.Scanner;

public class CheckSortedOrNot {

    //Naive Method//

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Enter how many elements you want: ");
            n=sc.nextInt();
            int[] A = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            System.out.println(isSorted(A));
        }
        public static boolean isSorted(int[] A){
            for(int i=0; i<A.length; i++)
                for(int j=i+1; j<A.length; j++)
                    if(A[j]<A[i])
                        return false;
            return true;

        }
}
