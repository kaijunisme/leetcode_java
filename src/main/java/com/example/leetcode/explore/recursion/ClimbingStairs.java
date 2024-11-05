package com.example.leetcode.explore.recursion;

public class ClimbingStairs {

    public static void main(String[] args) {
        var application = new ClimbingStairs();
        int n = 6; // 13
        int result = application.climbStairs(n);
        System.out.println("Result: " + result);
    }

    public int climbStairs(int n) {
        if (n < 3) return n;

        int x = 1, y = 2, temp;
        n = n - 2;
        while (n > 0) {
            temp = y;
            y = x + y;
            x = temp;
            n--;
        }
        return y;
    }
}
