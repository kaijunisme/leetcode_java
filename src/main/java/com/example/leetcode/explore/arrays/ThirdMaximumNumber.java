package com.example.leetcode.explore.arrays;

import java.util.LinkedList;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        var application = new ThirdMaximumNumber();
        // int[] nums = new int[] {3, 2, 1};
        // int[] nums = new int[] {1, 2};
        // int[] nums = new int[] {2, 2, 3, 1};
        // int[] nums = new int[] {2, 1, 1};
        int[] nums = new int[] {1, 2, 2, 5, 3, 5};
        int result = application.thirdMax(nums);
        System.out.println("Result: " + result);
    }

    public int thirdMax(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int index;
        list.add(nums[0]);
        for (int num: nums) {
            index = this.findIndex(list, num);
            if (index >= 0) {
                list.add(index, num);
            } else if (index == -1){
                list.addLast(num);
            }
        }

        return list.size() < 3 ? list.getFirst() : list.get(2);
    }

    private int findIndex(LinkedList<Integer> list, int num) {
        int index;
        for (index = 0; index < list.size() && index < 3; index++) {
            if (num == list.get(index)) return -2;
            if (num > list.get(index)) return index;
        }
        return -1;
    }

}
