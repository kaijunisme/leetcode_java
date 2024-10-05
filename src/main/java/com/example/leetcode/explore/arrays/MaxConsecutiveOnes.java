package com.example.leetcode.explore.arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        var application = new MaxConsecutiveOnes();
        int[] nums = new int[] {1, 0, 1, 1, 0, 1, 1, 1, 0, 1};
        int result = application.findMaxConsecutiveOnes(nums);
        System.out.println("Result: " + result);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (0 == nums[i]) {
                result = Math.max(result, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
    
        return Math.max(result, counter);
    }

}
