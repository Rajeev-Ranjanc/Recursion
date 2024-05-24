package string;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");
//        ArrayList<String> ans = permutationList("", "abc");
//        System.out.println(ans);

//        System.out.println(permutationCount("", "abc"));

        System.out.println(permutationCount2("", "abc", 0));


    }

    //    simply returning the all the permutations of any string
    public static void permutations(String p, String up) {

        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);// Ith character is exclusive
            String s = p.substring(i, p.length()); // here last one is also
            // exclusive
            permutations(f + ch + s, up.substring(1));//now
//            begin will from 1 as we leave 0 th index or already taken by
//            the ch variable

        }

    }

    static ArrayList<String> permutationList(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    public static int permutationCount(String p, String up) {
//        we can see in the recursive tree whenever up is 0 then we found
//        one answer so
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }
        //and after every call we're returning the count so return count
        return count;

    }

    public static int permutationCount2(String p, String up, int c) {
        if (up.isEmpty()) {
            c++;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            c += permutationCount(f + ch + s, up.substring(1));

        }

        return c;

    }
}

