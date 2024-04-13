package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
checking array is sorted or not using recursion
 */
public class Sorted {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(sorted(nums, 0));

    }

    public static boolean sorted(int[] nums, int index) {
        int n = nums.length;
        if (index == n-1) {
            return true;
        }
        return nums[index] <= nums[index + 1] && sorted(nums, index + 1);
    }
}
