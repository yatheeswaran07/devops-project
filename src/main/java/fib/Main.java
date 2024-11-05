package fib;

public class Main {
    public static void main(String[] args) {
        FibonacciGenerator generator = new FibonacciGenerator();
        int n = 10; // Change n for more Fibonacci numbers

        // Generate Fibonacci using recursive method
        System.out.println("Fibonacci number (recursive) for " + n + ": " + generator.fibonacciRecursive(n));

        // Generate Fibonacci series using iterative method
        generator.fibonacciIterative(n);
    }
}