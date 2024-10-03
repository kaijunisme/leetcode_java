package com.example.leetcode.explore.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        var application = new LongestSubstringWithoutRepeatingCharacters();
        // String s = "abcabcbb";
        // String s = "au";
        String s = "abba";
        int result = application.lengthOfLongestSubstring(s);
        System.out.println("Result: " + result);
    }

    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if (size <= 1) return size;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 1, result = 0;
        char ch;
        map.put(s.charAt(left), left);
        for (; right < size; right++) {
            ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
