import java.util.Scanner;

public class CopyingElements {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr1 = new int[n];
        int[] Arr2 = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            Arr1[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            Arr2[i] = Arr1[i];
        }
        System.out.println("After copying the elements: ");
        for(int x:Arr2){
            System.out.print(x+" ");
        }
    }
}
