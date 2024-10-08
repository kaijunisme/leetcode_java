package com.example.leetcode.explore.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        var application = new CheckIfNAndItsDoubleExist();
        int[] arr = new int[] {10, 2, 5, 3};
        // int[] arr = new int[] {3, 1, 7, 11};
        // int[] arr = new int[] {7, 1, 14, 11};
        // int[] arr = new int[] {-2, 0, 10, -19, 4, 6, -8};
        boolean result = application.checkIfExist(arr);
        System.out.println("Result: " + result);
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num: arr) {
            if (set.contains(num * 2)) {
                return true;
            } else if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }

}
