import java.util.Scanner;

public class BookAllocationProblemOrAllocateMaximumPages {
    public static int findPages(int[] arr, int n, int M){
        int start = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int end = sum;
        int ans = - 1;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if(isPossibleSolution(arr, n, M, mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static boolean isPossibleSolution(int[] arr, int n, int m, int mid){
        int studentCount = 1;
        int PageSum = 0;

        for (int i = 0; i < n; i++) {
            if(PageSum + arr[i] <= mid){
                PageSum += arr[i];
            }
            else {
                studentCount ++;
                if(studentCount > m || arr[i] > mid){
                    return false;
                }
                PageSum = arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many books you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Page number of the books: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int Student;
        System.out.println("Enter number of students: ");
        Student = sc.nextInt();

        System.out.println();

        System.out.println("The maximum number of pages assigned to a student is minimum: "+findPages(arr, n, Student));
    }
}
