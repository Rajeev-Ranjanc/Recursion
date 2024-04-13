package arrays;

import java.util.Arrays;
/*
Returning array from  n to 1 in recursion function
 */
public class ArrayReturn {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Arrays.toString(printNos(x)));
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] ans = new int[x];
        return helper(x, ans, 0);

    }

    private static int[] helper(int x, int[] ans, int index) {
        if (index > ans.length-1) {
            return ans;
        }
        ans[index] = x;
        return helper(x - 1, ans, index + 1);
    }
}
