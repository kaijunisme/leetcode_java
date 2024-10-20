package com.example.leetcode.explore.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {
        var application = new FindAllNumbersDisappearedInAnArray();
        int[] nums = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = application.findDisappearedNumbers(nums);
        System.out.println("Result: ");
        result.stream().forEach(System.out::println);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i, size = nums.length;
        boolean[] temp = new boolean[size];
        for (i = 0; i < size; i++) {
            temp[nums[i] - 1] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (i = 0; i < size; i++) {
            if (!temp[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }

}
