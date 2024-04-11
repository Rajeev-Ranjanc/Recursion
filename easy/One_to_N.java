package easy;

public class One_to_N {
    public static void main(String[] args) {
        int n = 5;
        printboth(n);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.print(n+" ");
    }

    public static void printboth(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        printboth(n-1);
        System.out.print(n+" ");
    }
}
