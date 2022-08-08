import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CheckSortedOrNotSecondMethod {
    //Efficient Method//
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] A= new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            A[i] =sc.nextInt();
        }
        System.out.println(isSorted(A));
    }

    @Contract(pure = true)
    public static boolean isSorted(int @NotNull [] A){
        for(int i=1; i<A.length; i++){
            if(A[i] < A[i-1])
                return false;
        }
        return true;
    }
}
