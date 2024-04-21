package string;

import java.util.Objects;

/*
Removing all occurrences of a characters from a string
 */
public class Stream {

    public static void main(String[] args) {
        String s = "raajaeeappv";
        System.out.println(skipAppNotApple(s));
    }

    //Returning no string
    static void skip(String p, String up) {
//        p ->  processed
//        up -> unprocessed

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }

    }

    //done by myself
    static String skipCh(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipCh(p, up.substring(1));
        }
        return skipCh(p + ch, up.substring(1));

    }

    //according to kunal which is also the correct one
    static String skip(String up) {
        //when the unprocessed string is empty nothing is to return so simply return the empty string
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        }
        return ch + skip(up.substring(1));

    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }

        return up.charAt(0) + skipApple(up.substring(1));


    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {

            return skipAppNotApple(up.substring(3));

        }

        return up.charAt(0) + skipAppNotApple(up.substring(1));


    }

}
