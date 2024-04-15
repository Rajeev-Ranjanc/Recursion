package patterns;

import java.util.Arrays;

/*
    Bubble sort using recursion
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1,8,6,5,7,88,56,5,1,2,3,4};
        //we start indexing from end of the array
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[col + 1])
            //swap
            {
                int t = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = t;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row-1, 0);
        }
    }
}

