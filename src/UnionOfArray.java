import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfArray {
    public static ArrayList<Integer> doUnion(int[] a, int n, int[] b, int m)
    {
        //Your code here
        int left = 0;
        int right = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while(left < n || right < m)
        {
            //skip duplicate//
            while(left > 0 && left < n && a[left] == a[left-1])
            {
                left++;
            }
            while(right > 0 && right < m && b[right] == b[right-1])
            {
                right++;
            }

            //check one array finished//
            if(left>=n)
            {
                res.add(b[right]);
                right++;
                continue;
            }
            if(right>=m)
            {
                res.add(a[left]);
                left++;
                continue;
            }

            //Compare//
            if(a[left] < b[right])
            {
                res.add(a[left]);
                left++;
            }
            else if(a[left] > b[right])
            {
                res.add(b[right]);
                right++;
            }
            else
            {
                res.add(a[left]);
                left++;
                right++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        int m;
        System.out.println("Enter m:");
        m=sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter elements: ");
        for (int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }

        System.out.println("First elements are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
        System.out.println("Second elements are: ");
        for (int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();

        System.out.println("Union of arrays is: ");
        ArrayList<Integer> list = new ArrayList<>(doUnion(arr1,n,arr2,m));
        for (int x:list) {
            System.out.print(x+" ");
        }
    }
}
