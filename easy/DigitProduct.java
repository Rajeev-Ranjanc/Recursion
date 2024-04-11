package easy;

//sum of digits
// tc : O(log(n))
public class DigitProduct {
    public static void main(String[] args) {

        int n = 55;
        System.out.println(DigitProduct(n));

    }

    private static int DigitProduct(int n) {

        if (n%10 == n) {//base condition
            return n;
        }

        return n % 10 * DigitProduct(n / 10);
    }
}
