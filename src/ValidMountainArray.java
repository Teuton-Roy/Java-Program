import java.util.Scanner;

public class ValidMountainArray {
    public static boolean ValidMountainArrays(int[] arr)
    {
        if(arr.length < 3)
            return false;

        int i=0;
        int j=arr.length-1;

        while(i+1 < arr.length-1 && arr[i] < arr[i+1])
            i++;
        while(j-1 > 0 && arr[j] < arr[j-1])
            j--;

        return i==j;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Mountain array is: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println(ValidMountainArrays(arr));

    }
}
