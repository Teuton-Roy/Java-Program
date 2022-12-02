import java.util.ArrayList;

public class reversString {

    //reverse a string//
    public static String reverse(char[] s) {
        int left = 0;            //point to first index//

        int right = s.length - 1;//point to last index//

        while (left < right) {   //swap the elements//
            char temp = s[left]; //store the first element in temp//
            s[left] = s[right];  //store the last element in first index//
            s[right] = temp;     //store the first element in last index//
            left++;              //increment the left index//
            right--;             //decrement the right index//
        }
        return new String(s);    //return the string//
    }

    // Driver Code//
    public static void main(String[] args) {
        System.out.println(reverse("abc123".toCharArray())); //convert string to char array//

        ArrayList <Integer> list = new ArrayList<>();
    }
}
