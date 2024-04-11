package easy;

public class CountZeroInNumber {
    public static void main(String[] args) {
        int n = 10980;
//        count(n);
//        System.out.println(count);
        System.out.println(count2(n));

    }

    static int count = 0;

    public static void count(int n) {

        //iterative
//        int cnt = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 0) {
//                cnt++;
//            }
//            n /= 10;
//        }
//        return cnt;

        if (n == 0) {
            return;
        }

        int rem = n % 10;

        if (rem == 0) {
            count++;
        }
        count(n / 10);

    }

    static int count2(int n ) {
        return helper(n , 0);
    }

    //Second way when we will get count as an argument
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);
        }
    }

}
