import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class RemoveDuplicateEfficientMethod {
    public static int removeDuplicate(int[] A, int n){
        int res = 1;
        for (int i=1; i<n; i++) {
            if (A[res - 1] != A[i]) {
                A[res] = A[i];
                res++;
            }
            //return A[i];
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Before remove duplicate values the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        n = removeDuplicate(a,n);
        System.out.println("After remove duplicate values the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
