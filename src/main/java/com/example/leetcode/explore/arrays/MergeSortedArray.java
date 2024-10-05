package com.example.leetcode.explore.arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        var application = new MergeSortedArray();
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        int m = 3, n = 3;
        // int[] nums1 = new int[] {1};
        // int[] nums2 = new int[] {};
        // int m = 1, n = 0;
        application.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;
        m--;
        n--;

        while (lastIndex >= 0) {
            if (m < 0) {
                nums1[lastIndex--] = nums2[n--];
                continue;
            }

            if (n < 0) {
                nums1[lastIndex--] = nums1[m--];
                continue;
            }

            if (nums1[m] >= nums2[n]) {
                nums1[lastIndex--] = nums1[m--];
            } else {
                nums1[lastIndex--] = nums2[n--];
            }
        }
    }

}
