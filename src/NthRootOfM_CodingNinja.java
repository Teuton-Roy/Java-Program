import java.util.Scanner;

public class NthRootOfM_CodingNinja {
    public static double FindNthRootOfM(int n, int m){
        double start = 1;
        double end = m;
        double mid = start + (end - start) / 2.0;
        double esp = 1e-8;

        while((end - start) > esp){
            if(isPossibleSolution(mid,n) > m){
                end = mid;
            }
            else {
                start = mid;
            }
            mid = start + (end - start) / 2.0;
        }
        return start;
    }
    public static double isPossibleSolution(double number, int n){
        double ans =1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans * number;
        }
        return ans;
   }

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the root: ");
        n = sc.nextInt();

        int m;
        System.out.println("Enter the number: ");
        m = sc.nextInt();

       System.out.println("N'th root of M is: "+FindNthRootOfM(n,m));
   }
}
