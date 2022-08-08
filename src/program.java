import java.util.*;

public class program
{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many array elements you want: ");
        n = sc.nextInt();

        int Arr[] = new int[100];
        System.out.println("Enter the array elements: ");

        //This is how we Scan Array elements that given by user//
        for(int i=0; i<n; i++){
            Arr[i] =sc.nextInt();
        }

        System.out.println("Array elements are: ");

        //Show the array elements//
        for(int i=0; i<n; i++){
            System.out.println(Arr[i] +" ");
        }
        //Using Arr.length we get length of the array//
        System.out.println("Length of the array is: "+Arr.length);

        //Now Reverse the Array//
        System.out.println("Reverse array elements: ");

        //This is how we Reverse the array elements//\
        for(int i=n-1; i>=0; i--){
            System.out.println(Arr[i]+" ");
        }

        //Increase evey elements of array//
        System.out.println("After increasing every elements");
        for(int i=0; i<n; i++){
            System.out.println(Arr[i]+1);
        }
    }
}
