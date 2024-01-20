/*
binary search using recursion
 */
public class BS_rec {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 55, 66, 78};
        int target = 7;
        System.out.println(BinarySearch(nums, target, 0, nums.length - 1));
    }

    public static int BinarySearch(int[] nums, int target, int start, int end) {
//        base condition
        if (start > end) {
            return -1;
        }
//        calculating mid
        int mid = start+(end-start)/2;
//        if nums[mid] == target it  means we found the ans so return mid
        if(target == nums[mid]){
            return mid;
        }
        //target is smaller than we have to traverse next part of the array
        if(target<nums[mid]){
            return BinarySearch(nums , target ,start , mid-1 );
        }
        return BinarySearch(nums , target , mid+1 , end);
    }
}
