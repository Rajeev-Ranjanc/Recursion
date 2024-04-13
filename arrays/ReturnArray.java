package arrays;

import java.util.Arrays;
/*
Returning array from 1 to n in recursion function
 */
public class ReturnArray {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Arrays.toString(printNos(x)));
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] ans = new int[x];
        return helper(x, ans, ans.length - 1);
    }

    private static int[] helper(int x, int[] ans, int i) {
        if (i < 0) {
            return ans;
        }
        ans[i] = x;
        return helper(x - 1, ans, i - 1);
    }
}
