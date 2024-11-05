package fib;

public class FibonacciGenerator {

    // Recursive method to generate Fibonacci number
    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to generate Fibonacci series
    public void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}