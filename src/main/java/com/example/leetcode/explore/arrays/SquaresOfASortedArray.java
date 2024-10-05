package com.example.leetcode.explore.arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        var application = new SquaresOfASortedArray();
        // int[] nums = new int[] {-4, -1, 0, 3, 10};
        int[] nums = new int[] {-7, -3, 2, 3, 11};
        int[] result = application.sortedSquares(nums);
        for (int num: result) {
            System.out.println(num);
        }   
    }

    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        int left = 0, right = size - 1, index = size - 1;
        while (index >= 0) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                left++;
            } else {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }

}
