package com.example.leetcode.explore.recursion;

public class FibonacciNumber {

    public static void main(String[] args) {
        var application = new FibonacciNumber();
        int n = 4;
        int result = application.fib(n);
        System.out.println("Result: " + result);
    }

    public int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
