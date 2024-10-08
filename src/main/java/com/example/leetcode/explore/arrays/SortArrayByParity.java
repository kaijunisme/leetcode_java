package com.example.leetcode.explore.arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        var application = new SortArrayByParity();
        // int[] nums = new int[] {3, 1, 2, 4};
        // int[] nums = new int[] {2, 1, 3, 4};
        // int[] nums = new int[] {0};
        // int[] nums = new int[] {1, 3};
        int[] nums = new int[] {1, 2, 3};
        int[] result = application.sortArrayByParity(nums);
        for (int num: result) {
            System.out.println(num);
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1, temp;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
                continue;
            }

            if (nums[right] % 2 == 0) {
                temp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = temp;
                continue;
            }

            right--;
        }

        return nums;
    }

}
