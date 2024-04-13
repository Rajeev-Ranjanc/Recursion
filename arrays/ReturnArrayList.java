package arrays;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> ans = FindAll(nums, target, 0, new ArrayList<Integer>());
        System.out.println(ans);
    }

    private static ArrayList<Integer> FindAll(int[] nums, int target, int index, ArrayList<Integer> list) {
        if (index == nums.length) {
            return list;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        return FindAll(nums, target, index + 1, list);
    }
}
