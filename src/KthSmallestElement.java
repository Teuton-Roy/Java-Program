import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for (int i=k; i<arr.length; i++){
            if (arr[i] < pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int k;
        System.out.println("Enter k: ");
        k = sc.nextInt();

        n = kthSmallest(arr, k);
        System.out.print("K th smallest element is: "+n);
    }

}
