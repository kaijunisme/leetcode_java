package com.example.leetcode.explore.arrays;

public class RemoveElement {

    public static void main(String[] args) {
        var application = new RemoveElement();
        int[] nums = new int[] {3, 2, 2, 3};
        int val = 3;
        // int[] nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        // int val = 2;
        int result = application.removeElement(nums, val);
        System.out.println("Result: " + result);
    }

    public int removeElement(int[] nums, int val) {
        int result = 0, fast = 0, size = nums.length;

        while (fast < size) {
            if (nums[fast] == val) {
                fast++;
            } else {
                nums[result++] = nums[fast++];
            }
        }

        return result;
    }

}
