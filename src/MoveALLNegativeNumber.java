import java.util.Scanner;

public class MoveALLNegativeNumber {
    public static void Move(int[] arr, int left, int right)
    {
        while(left<=right)
        {
            if(arr[left]<0 && arr[right]<0)
            {
                left++;
            }
            else if (arr[left]>0 && arr[right]<0) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if (arr[left]>0 && arr[right]>0) {
                right--;
            }
            else {
                left++;
                right--;
            }
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

        Move(Arr, 0, n-1);
        System.out.println("After moving all negative elements: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }

}
