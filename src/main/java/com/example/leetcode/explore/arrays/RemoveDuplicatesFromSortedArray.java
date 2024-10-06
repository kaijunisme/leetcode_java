package com.example.leetcode.explore.arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        var application = new RemoveDuplicatesFromSortedArray();
        // int[] nums = new int[] {1, 1, 2};
        int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = application.removeDuplicates(nums);
        System.out.println("Result: " + result);
    }

    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size == 1) return 1;

        int result = 0, fast = 1;

        while (fast < size) {
            if (nums[result] == nums[fast]) {
                fast++;
            } else {
                nums[++result] = nums[fast++];
            }
        }

        return result + 1;
    }

}
