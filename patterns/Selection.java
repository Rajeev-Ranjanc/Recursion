package patterns;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else {
            //now we have the maximum elements from the array
            //so now we just need to swap these with max index
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selection(arr, row - 1, 0, 0);
        }
    }
}
