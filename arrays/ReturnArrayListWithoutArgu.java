package arrays;

import java.util.ArrayList;

/*
Although this is not optimal one in this on every recursion call we are creating new list and if the target hits them in that list
of that function call will contain only that function call ans /index of the target elements
 */
public class ReturnArrayListWithoutArgu {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> ans = FindAll(nums, target, 0);
        System.out.println(ans);
    }

    private static ArrayList<Integer> FindAll(int[] nums, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == nums.length) {
            return list;
        }

        //this will contain answer for that function only
        if (nums[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = FindAll(nums, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
