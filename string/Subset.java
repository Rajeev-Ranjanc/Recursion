package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subset(arr);
//        for (List<Integer> a : ans) {
//            System.out.println(a);
//        }

//for the duplicate elements subset problem
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> a : ans) {
            System.out.println(a);
        }


    }

    // converting recursive problems into iterative
    static List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i)); //now internal will be copy of the outer(i)
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            //if current and previous element is same s = e+1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {

                List<Integer> internal = new ArrayList<>(outer.get(j)); //now internal will be copy of the outer(i)

                internal.add(arr[i]);

                outer.add(internal);
            }
        }

        return outer;

    }
}
/*
Kunal is legend
 */