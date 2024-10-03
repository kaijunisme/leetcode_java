package com.example.leetcode.explore.hashtable;

public class JewelsAndStones {

    public static void main(String[] args) {
        var jewelsAndStones = new JewelsAndStones();
        // String jewels = "aA", stones = "aAAbbbb";
        String jewels = "z", stones = "ZZ";
        int result = jewelsAndStones.numJewelsInStones(jewels, stones);
        System.out.println("Result: " + result);
    }

    public int numJewelsInStones(String jewels, String stones) {
        boolean[][] letters = new boolean[2][26];

        int i = 0, value, result = 0;
        for (; i < jewels.length(); i++) {
            value = (int) jewels.charAt(i);
            // Uppercase
            if (value < 97) {
                letters[0][value - 65] = true;
            }
            // Lowercase
            else {
                letters[1][value - 97] = true;
            }
        }

        for (i = 0; i < stones.length(); i++) {
            value = (int) stones.charAt(i);
            // Uppercase
            if (value < 97) {
                if (letters[0][value - 65]) result++;
            }
            // Lowercase
            else {
                if (letters[1][value - 97]) result++;
            }
        }

        return result;
    }

}
