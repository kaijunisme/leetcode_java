package com.example.leetcode.explore.arrays;

public class ValidMountainArray {

    public static void main(String[] args) {
        var application = new ValidMountainArray();
        // int[] arr = new int[] {2, 1};
        // int[] arr = new int[] {3, 5, 5};
        // int[] arr = new int[] {0, 3, 2, 1};
        // int[] arr = new int[] {0, 1, 2, 3};
        int[] arr = new int[] {3, 2, 1, 0};
        boolean result = application.validMountainArray(arr);
        System.out.println("Result: " + result);
    }

    public boolean validMountainArray(int[] arr) {
        int size = arr.length, left = 0, right = size - 1;
        if (size < 3) return false;

        while (left < right) {
            if (arr[left + 1] > arr[left]) {
                left++;
            } else if (arr[left + 1] == arr[left]) {
                return false;
            } else {
                break;
            }
        }

        while (left < right) {
            if (arr[right - 1] > arr[right]) {
                right--;
            } else {
                return false;
            }
        }
    
        return !(left == 0 || right == size - 1);
    }

}
