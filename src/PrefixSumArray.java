
public class PrefixSumArray {
    public static int[] preSum(int[] arr, int n)
    {
        int[] prefix_sum = new int[n];
        prefix_sum[0] = arr[0];

        for (int i=1; i<n; i++)
        {
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }
        return prefix_sum;
    }

    public static int getSum(int[] prefix_sum, int left, int right)
    {
        if (left!=0){
            return prefix_sum[right] - prefix_sum[left-1];
        }
        else{
            return prefix_sum[right];
        }
    }

    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int[] arr = {3, 10, 6, 12, 9, 8, 7};
        int n = 7;

        int[] prefix_sum = preSum(arr, n);

        System.out.println(getSum(prefix_sum, 1, 3));

        System.out.println(getSum(prefix_sum, 0, 2));
    }
}
