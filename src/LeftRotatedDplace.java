import java.util.Scanner;

public class LeftRotatedDplace {
   public static void leftRotateOne(int[] a, int n)
   {
      int temp = a[0];
      for(int i=1; i<n; i++){
         a[i-1] = a[i];
      }
      a[n-1] = temp;
   }
   public static void leftRotate(int[] a, int d, int n){
      for (int i=0; i<d; i++){
         leftRotateOne(a, n);
      }
   }

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("Enter how many number you want: ");
      n=sc.nextInt();

      int[] a = new int[n];
      System.out.println("Enter array elements: ");
      for(int i=0; i<n; i++){
         a[i] = sc.nextInt();
      }

      System.out.println("Before rotate by 'd' place: ");
      for(int i=0;i<n; i++){
         System.out.print(a[i]+" ");
      }
      System.out.println();

      int d;
      System.out.println("Enter the D: ");
      d = sc.nextInt();

      leftRotate(a,d,n);
      System.out.println("After rotate by 'd' place");
      for (int i=0; i<n; i++){
         System.out.print(a[i]+" ");
      }
   }
}
