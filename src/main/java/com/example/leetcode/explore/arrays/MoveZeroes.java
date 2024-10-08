package com.example.leetcode.explore.arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        var application = new MoveZeroes();
        int[] nums = new int[] {0, 1, 0, 3, 12};
        // int[] nums = new int[] {0};
        // int[] nums = new int[] {0, 1};
        // int[] nums = new int[] {1, 0, 1};
        application.moveZeroes(nums);
        for (int num: nums) {
            System.out.println("Result: " + num);
        }
    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        int size = nums.length;
        while (index < size) {
            nums[index++] = 0;
        }
    }

}
