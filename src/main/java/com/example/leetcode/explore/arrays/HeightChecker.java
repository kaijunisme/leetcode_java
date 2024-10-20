package com.example.leetcode.explore.arrays;

import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        var application = new HeightChecker();
        // int[] heights = new int[] {1, 1, 4, 2, 1, 3};
        // int[] heights = new int[] {5, 1, 2, 3, 4};
        int[] heights = new int[] {1, 2, 3, 4, 5};
        int result = application.heightChecker(heights);
        System.out.println("Result: " + result);
    }

    public int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        Arrays.sort(temp);
        
        int index, size = heights.length, result = 0;
        for (index = 0; index < size; index++) {
            if (temp[index] != heights[index]) {
                result++;
            }
        }
        return result;
    }

}
