package arrays;

/*
rotated binary search using recursion
 */
public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
//        System.out.println(search(arr, target, 0, arr.length -1));
        System.out.println(searchRecursive(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        //iterative approach
        if (start > end) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                //I found ny answer
                return mid;
            } else if (arr[start] <= arr[mid]) {
                //Its mean first half of the array is sorted
                //then search in the first half of the array
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int searchRecursive(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            //we found our answer
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            //first part of the array is sorted, so we need to find target in this array
            if (target >= arr[start] && target <= arr[mid]) {
                return searchRecursive(arr, target, start, mid - 1);
            } else {
                return searchRecursive(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return searchRecursive(arr, target, mid + 1, end);
        }
        return searchRecursive(arr, target, start, mid - 1);
    }
}
