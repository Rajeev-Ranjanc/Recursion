package easy;

public class SumN {
    public static void main(String[] args) {
        int ans = sum(20);
        System.out.println(ans);
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
