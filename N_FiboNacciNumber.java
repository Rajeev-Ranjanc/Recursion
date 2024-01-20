//Kunal
/*
Fibonacci number of Nth number
Using Recursion
as we Fibonacci(N) is the sum of fibonacci(n-1) + fibonacci(n-2)
and fib(1) 0
fib
 */
public class N_FiboNacciNumber {
    public static void main(String[] args) {
        System.out.println(NFiboNumber(6));
    }
    public static int NFiboNumber(int n){
        if(n<2){
            return n;
        }
        return (NFiboNumber(n-1)+NFiboNumber(n-2));
    }
}
