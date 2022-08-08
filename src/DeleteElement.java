import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n= sc.nextInt();

        int[] Arr1 = new int[n];
        int[] Arr2 = new int[n-1];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            Arr1[i] = sc.nextInt();
        }

        int index;
        System.out.println("Enter index of value to be deleted: ");
        index = sc.nextInt();

        //Using copy methods//
        for(int i=0; i<n; i++)
        {
            if(i<index){            // index = 2;
                Arr2[i] = Arr1[i]; //Arr1[] = 10 20 30 40 50
            }                      //Arr2[] = 10 20 40 50
            else if (i==index)
                continue;
            else{
                Arr2[i-1] = Arr1[i];
            }
        }

        System.out.println("Elements are: ");
        for(int i=0; i<n-1; i++){
            System.out.print(Arr2[i]+" ");
        }
    }
}
