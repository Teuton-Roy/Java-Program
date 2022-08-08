import java.util.Scanner;

public class IncreaseSize {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter how many elements you want: ");
        n=sc.nextInt();

        int[] arr = new int[n];
        int[] B = new int[2*n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Length is: "+arr.length);

        for(int i=0;i<n;i++){
            B[i] = arr[i];
        }
        arr=B;

        System.out.println("After Increase Size Length is: "+arr.length);
    }
}
