package com.example.leetcode.explore.arrays;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        var application = new FindNumbersWithEvenNumberOfDigits();
        int[] nums = new int[] {12, 345, 2, 6, 7896};
        int result = application.findNumbers(nums);
        System.out.println("Result: " + result);
    }

    public int findNumbers(int[] nums) {
        int result = 0, digit;

        for (int num: nums) {
            digit = 1;
            while ((num = num / 10) > 0) {
                digit++;
            }
            
            if (digit % 2 == 0) result++;
        }

        return result;
    }

}
