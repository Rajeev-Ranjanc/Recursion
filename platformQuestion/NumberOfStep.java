//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
/*
Just did while watching kunal easy recursion video
 */
package platformQuestion;

public class NumberOfStep {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        if ((num & 1) != 0) {
            return helper(num / 2, c + 1);
        }
        return helper(num - 1, c + 1);
    }
}
