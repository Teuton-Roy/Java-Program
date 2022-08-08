import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void subArraySum(int[] a, int n,int sum) {
        int subsum = 0;
        int start = 0;
        int i = 0;
        while(i <= n) {
            if(subsum == sum) {
                System.out.println(start+1);
                return;
            } else if(subsum > sum) {
                subsum = subsum - a[start];
                start++;
            } else {
                subsum = subsum + a[i];
                i++;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many numbers you want: ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }

        int k;
        System.out.println("Enter K value: ");
        k = sc.nextInt();

        System.out.println("Array elements are: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Sub Array Position is: ");
        subArraySum(a,n,k);
    }
}
