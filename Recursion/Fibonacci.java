public class Fibonacci {
    public static int fibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1=fibonacciNumber(n-1);
        int fib2=fibonacciNumber(n-2);
        int fn=fib1+fib2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(7));
    }
}
