import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args)
    {
        //Introduction//
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");

        int n; int max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr = new int[50];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            Arr[i] = sc.nextInt();
        }

        max = Arr[0];
        for(int i=0; i<n; i++){
            if(Arr[i]>max){
                max = Arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);
    }
}
