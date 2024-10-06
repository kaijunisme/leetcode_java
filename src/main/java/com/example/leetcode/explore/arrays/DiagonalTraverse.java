package com.example.leetcode.explore.arrays;

public class DiagonalTraverse {

    public static void main(String[] args) {
        var application = new DiagonalTraverse();
        // int[][] mat = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // int[][] mat = new int[][] {{1, 2}, {4, 5}};
        // int[][] mat = new int[][] {{1, 2}, {4, 5}, {7, 8}};
        // int[][] mat = new int[][] {{1, 2, 3}, {4, 5, 6}};
        // int[][] mat = new int[][] {{1, 2, 3}};
        int[][] mat = new int[][] {{1}, {2}, {3}};
        int[] result = application.findDiagonalOrder(mat);
        for (int num: result) {
            System.out.println("Result: " + num);
        }
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int x = 0, xl = mat[0].length, y = 0, yl = mat.length, index = 0;
        int[] result = new int[xl * yl];

        boolean upperRight = true;
        xl--;
        yl--;

        while (index < result.length) {
            result[index++] = mat[y][x];

            if (upperRight) {
                if (y - 1 < 0 || x + 1 > xl) {
                    upperRight = false;
                    if (x + 1 > xl) {
                        y++;
                    } else {
                        x++;
                    }
                } else {
                    x++;
                    y--;
                }
            } else {
                if (x - 1 < 0 || y + 1 > yl) {
                    upperRight = true;
                    if (y + 1 > yl) {
                        x++;
                    } else {
                        y++;
                    }
                } else {
                    x--;
                    y++;
                }
            }
        }

        return result;
    }

}
