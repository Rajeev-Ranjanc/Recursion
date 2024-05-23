package arrays;


import java.util.ArrayList;

/*
Linear search using recursion returning index of that elements if that element exists in the array otherwise returning -1;
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 4, 5};
        int target = 4;
        System.out.println(Find(nums, target, 0));
        System.out.println(linearSearch(nums, target, 0));
        System.out.println(FindIndexFromLast(nums, target, nums.length - 1));
        FindAllIndex(nums, target, 0);
        System.out.println(list);
    }


    private static boolean Find(int[] nums, int target, int index) {
        if (index == nums.length - 1) {
            return true;
        }
//        if (nums[index] == target) {
//            return true;
//        }

        return nums[index] == target || Find(nums, target, index + 1);
    }

    private static int linearSearch(int[] nums, int target, int index) {
        int n = nums.length;
        if (index > n) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return linearSearch(nums, target, index +1);
    }

    //searching from last of the index
    private static int FindIndexFromLast(int[] nums, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return FindIndexFromLast(nums, target, index - 1);
    }


    //Finding all indexes of a target
    static ArrayList<Integer> list = new ArrayList<>();

    private static void FindAllIndex(int[] nums, int target, int index) {
        int n = nums.length;
        if (index == n) {
            return;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        FindAllIndex(nums, target, index + 1);
    }


}
