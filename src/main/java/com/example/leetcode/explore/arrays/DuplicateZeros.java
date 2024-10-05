package com.example.leetcode.explore.arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        var application = new DuplicateZeros();
        int[] arr = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
        application.duplicateZeros(arr);
    }

    public void duplicateZeros(int[] arr) {
        int size = arr.length, a = 0, t = 0;
        int[] temp = new int[size];
        for (a = 0; a < size; a++) {
            temp[a] = arr[a];
        }

        for (a = 0, t = 0; a < size; a++, t++) {
            if (temp[t] == 0) {
                arr[a++] = 0;
                if (a < size) {
                    arr[a] = 0;
                }
            } else {
                arr[a] = temp[t];
            }
        }
    }

}
