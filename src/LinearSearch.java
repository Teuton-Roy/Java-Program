import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int n, int key){
        for (int i=0; i<n; i++){
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many number you wants: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int key;
        System.out.println("Enter search value: ");
        key = sc.nextInt();

        n=linearSearch(arr,n,key);
        System.out.println("Element exist at index: "+n);
    }
}
