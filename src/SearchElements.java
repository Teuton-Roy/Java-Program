import java.util.Scanner;

public class SearchElements {
    public static void main(String[] args){
        //Introduction//
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");

        int n; int key;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr = new int[50];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            Arr[i] = sc.nextInt(); //Accessing array elements//
        }

        System.out.println("Enter the element that you want to search: ");
        key = sc.nextInt();

        for(int i=0; i<n; i++){
            //Finding Array element//
            if(Arr[i] == key){
                System.out.println("Element found at index " +i);
                System.exit(0);
            }
        }
        System.out.println("Not Found (-_-) ");
    }
}
