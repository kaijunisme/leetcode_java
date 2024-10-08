package com.example.leetcode.explore.arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        var application = new ReplaceElementsWithGreatestElementOnRightSide();
        // int[] arr = new int[] {17, 18, 5, 4, 6, 1};
        int[] arr = new int[] {400};
        int[] result = application.replaceElements(arr);
        for (int num: result) {
            System.out.println(num);
        }
    }

    public int[] replaceElements(int[] arr) {
        int right = arr.length - 1, max = -1, temp;
        for (; right >= 0; right--) {
            temp = arr[right];
            arr[right] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }

}
