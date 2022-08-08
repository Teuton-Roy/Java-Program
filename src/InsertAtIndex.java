import java.util.Scanner;

public class InsertAtIndex {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you wants: ");
        n=sc.nextInt();

       int[] Arr1 = new int[n];
       int[] Arr2 = new int[n+1];

       System.out.println("Enter the array elements: ");
       for(int i=0; i<n; i++){
           Arr1[i] = sc.nextInt();
       }

       int index;
       System.out.println("Enter the index no. ");
       index = sc.nextInt();

       int element;
       System.out.println("Enter the element that you insert: ");
       element = sc.nextInt();

       for(int i=0; i<n+1; i++){
           if(i<index){
               Arr2[i] = Arr1[i];
           }
           else if (i==index) {
               Arr2[index] = element;
           }
           else{
               Arr2[i] = Arr1[i-1];
           }
       }
       System.out.println("After insert the element array is: ");
        for(int i=0; i<n+1; i++){
            System.out.print(Arr2[i]+" ");
        }
    }
}
