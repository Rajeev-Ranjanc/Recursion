package easy;

public class Concept {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        print(n--); // which will lead to infinite recursion
        print(--n);

    }
}
