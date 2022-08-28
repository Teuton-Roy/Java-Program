import java.util.Scanner;

public class BubbleSorting {

    public static void Bubble_Sort(int[] arr){

        boolean swapped;

        //  Loop runs till n-1 times//
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;

            //for each step the max value comes to the last respective index//
            for (int j = 1; j < arr.length - i; j++) {
                //swap if j element smaller than j-1 element//

                if(arr[j] < arr[j-1]){
                    //swap//

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // when swapped == true; it's break//
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        Bubble_Sort(arr);
        System.out.println("After Bubble Sorting the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
