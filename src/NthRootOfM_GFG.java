import java.util.Scanner;

public class NthRootOfM_GFG {
    public static int findNthRoot(int n, int m){
        int start = 1;
        int end = m;
        int mid = start + (end - start) / 2;

        while (start<=end){
            double value = Math.pow(mid, n);

            if(value == m){
                return mid;
            } else if (value > m) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the root: ");
        n = sc.nextInt();

        int m;
        System.out.println("Enter the number: ");
        m = sc.nextInt();

        System.out.println();
        System.out.println("N'th Root of M: "+findNthRoot(n,m));
    }
}
