import java.util.Scanner;

public class MoveNegativeEnd {

    public static void segregateElements(int[] arr, int n) {

        int[] res = new int[n];
            int idx = 0;

            //first add all positive numbers
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    res[idx] = arr[i];
                    idx++;
                }
            }

            //then add all neg numbers
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    res[idx] = arr[i];
                    idx++;
                }
            }

            //copy all the el from res to arr
            int i = 0;
            for (int el : res) {
                arr[i] = el;
                i++;
            }
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n=sc.nextInt();

        int[] Arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Before move all negative numbers: ");
        for (int i=0; i<n; i++){
            System.out.print(Arr[i]+" ");
        }

        System.out.println();

        segregateElements(Arr,n);
        System.out.println("After moving all negative elements: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}
