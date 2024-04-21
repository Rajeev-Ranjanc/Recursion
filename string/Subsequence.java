package string;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {

        String s = "abc";

//        subsequence("", s);
//        subsequenceAscii("", s);

//        System.out.println(subsequence("", s, ans));

//        System.out.println(subsequence("", s, new ArrayList<>()));

//        System.out.println(subsequenceReturn("", s));

//        System.out.println(subsequenceAsciiReturn("", s));

        System.out.println(generateSubsequences("abc"));

    }

    /*
    Here we are returning all the subsets of the string s what if we want to add into an arrayList
    and return them
     */
    static void subsequence(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequence(p, up.substring(1));

        subsequence(p + ch, up.substring(1));

        // p+ch -> is not changing the entire p string although. -> because string is immutable in java
        // it's creating a new string and copying the entire p and add ch in every call

        //        subsequence(p, up.substring(1));

    }

    /*
        This is the first way to do return a list to do so we just can pass the arraylist in the arguments and
        add answer every time into them
    */
    static ArrayList<String> subsequence(String p, String up, ArrayList<String> ans) {

        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        subsequence(p + ch, up.substring(1), ans);

        subsequence(p, up.substring(1), ans);

        return ans;

    }

    /*
        Another way is to do so is we can create an arraylist inside the body of the function and by this on every recursive call
        a new arraylist will initialise, and later we can merge into them as per we see in the array(array package)

     */

    static ArrayList<String> subsequenceReturn(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            if (!p.equals(""))
                ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsequenceReturn(p + ch, up.substring(1));
        ArrayList<String> right = subsequenceReturn(p, up.substring(1));

        left.addAll(right);
        //now we can return anyone either left or right both are equa;
        return left;
    }


    static void subsequenceAscii(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequenceAscii(p, up.substring(1));

        subsequenceAscii(p + ch, up.substring(1));

        subsequenceAscii(p + (ch + 0), up.substring(1));

        // p+ch -> is not changing the entire p string although. -> because string is immutable in java
        // it's creating a new string and copying the entire p and add ch in every call

        //        subsequence(p, up.substring(1));

    }

    static ArrayList<String> subsequenceAsciiReturn(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subsequenceAsciiReturn(p + ch, up.substring(1));
        ArrayList<String> second = subsequenceAsciiReturn(p, up.substring(1));
        ArrayList<String> third = subsequenceAsciiReturn(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        //now we can return anyone either left or right both are equa;
        return first;
    }

    public static List<String> generateSubsequences(String s) {
        return helper("", s);
    }

    public static List<String> helper(String p, String up) {
        if (up.isEmpty()) {
            List<String> ans = new ArrayList<>();
            if (!p.isEmpty())
                ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        List<String> left = helper(p + ch, up.substring(1));
        List<String> right = helper(p, up.substring(1));

        left.addAll(right);
        //now we can return anyone either left or right both are equa;
        return left;
    }

}
