import java.util.Scanner;

public class DeleteElementSecondMathods {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        int[] Arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }

        int index;
        System.out.println("Enter index of value to be deleted: ");
        index = sc.nextInt();

        //Using left-rotation mathods//
        int temp = Arr[index];
        for(int i=index+1; i<n; i++)
        {
            Arr[i-1] = Arr[i];
        }
        //Arr[n-1]=0;
        System.out.println("Elements are: ");
        for(int i=0; i<n-1; i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
