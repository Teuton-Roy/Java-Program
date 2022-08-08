import java.util.Scanner;

public interface GoodPairNumbers {
    public static int IdenticalPairs(int[] nums)
    {
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many numbers you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        n = IdenticalPairs(arr);
        System.out.println("Good pairs of this array is: " +n);
    }
}
