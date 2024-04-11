package easy;

public class ReverseNumber {
    static int ans = 0;

    //first way
    private static void revereDigit1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        revereDigit1(n / 10);

    }

    private static int rev2(int n) {
        //sometimes you might some additional variables in the argument in that case, make another function
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);

    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }


    public static void main(String[] args) {
        int n = 182412345;
//        revereDigit1(n);
//        System.out.println(ReverseNumber.ans);

        System.out.println(rev2(n));
    }


}
