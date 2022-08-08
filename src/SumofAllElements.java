import java.util.Scanner;

public class SumofAllElements {
    public static void main(String[] args){
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");
        int n; int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you wants: ");
        n = sc.nextInt();

        int[] Arr = new int[50];
        System.out.println("######################################");
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++) {
            Arr[i] = sc.nextInt(); //Accessing Array Elements//
        }
        System.out.println("######################################");
        for(int i=0; i<n; i++){
            sum = sum+Arr[i]; //Sum of Elements//
        }
        System.out.println("Sum of All Elements in Array is: "+sum);
        System.out.println("######################################");
    }
}
