package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        //low and high is the index of the array

        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {

            //base condition -> I forgot this never ever forget this
            if (start >= end) {
                return;
            }

            //also a reason why if its already sorted it will not swap
            while (nums[start] < pivot) {
                //it means the smaller elements from the left of the index is smaller than okay simply check next ele
                start++;
            }

            while (nums[end] > pivot) {
                //it means yes okay greater element than the pivot are at right place so yes then simply check for next
                end--;
            }

            if (start <= end) {
                //do swap
                //then swap thus greater element then the pivot may lie over the right of the array and
                //smaller may lie at the left part of the array
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

        }
        //now my pivot is at correct index, please sort wo halves now
        sort(nums, low, end);
        sort(nums, start, high);

    }
}
