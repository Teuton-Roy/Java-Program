public class exception {
    //Find the maximum number from an array if array is empty throw an exception//
    public static void main(String[] args) {
        int[] arr = new int[0];
        int max = Integer.MIN_VALUE;
        try {
            for (int j : arr) {
                if (j > max) {
                    max = j;
                }
            }
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }
}
