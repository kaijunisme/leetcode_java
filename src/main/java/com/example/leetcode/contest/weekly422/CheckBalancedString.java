package com.example.leetcode.contest.weekly422;

public class CheckBalancedString {

    public static void main(String[] args) {
        var application = new CheckBalancedString();
        String num = "24122";
        boolean result = application.isBalanced(num);
        System.out.println("Result: " + result);
    }

    public boolean isBalanced(String num) {
        int index, size = num.length(), odd = 0, even = 0;
        for (index = 0; index < size; index += 2) {
            odd += (Integer.valueOf(String.valueOf(num.charAt(index))));
        }

        for (index = 1; index < size; index += 2) {
            even += (Integer.valueOf(String.valueOf(num.charAt(index))));
        }

        return odd == even;
    }
}
