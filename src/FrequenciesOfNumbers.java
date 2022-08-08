import java.util.Scanner;

public class FrequenciesOfNumbers {
    public static void Printfreq(int[] arr, int n)
    {
        int freq = 1;
        int i = 1;
        while(i<n)
        {
            while(i<n && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }
        System.out.println(arr[i-1]+" "+freq);
            i++;
            freq = 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter n:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Frequencies of number is: ");
        Printfreq(arr,n);
    }
}
