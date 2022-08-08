import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args)
    {
        //Introduction//
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");

        int n; int max1; int max2;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want: ");
        n = sc.nextInt();

        int[] Arr = new int[50];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            Arr[i] = sc.nextInt();
        }

        int a;
        System.out.println("Enter a: ");
        a = sc.nextInt();

        max1=max2=Arr[0];
        for(int i=0; i<n; i++){
            if(Arr[i]>max1){
                max2 = max1;
                max1 = Arr[i];
            }
            else if (Arr[i]>max2) {
                max2 = Arr[i];
            }

            int res1 = max1 - a;
            int res2 = max2 - a;

            ans = res1 + res2;
        }
        System.out.println("First Largest element is: "+max1);
        System.out.println("Second largest element is: "+max2);
        System.out.println(ans);
    }
}
