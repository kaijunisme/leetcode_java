package com.example.leetcode.explore.hashtable;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        var groupAnagrams = new GroupAnagrams();
        // String[] strs = new String[] {"eat", "ate", "tel", "let"};
        String[] strs = new String[] {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        for (List<String> list: result) {
            for (String str: list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();

        int hashcode;
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            hashcode = Arrays.hashCode(chars);
            List<String> list = map.getOrDefault(hashcode, new ArrayList<>());
            list.add(str);
            map.put(hashcode, list);
        }

        return new ArrayList<>(map.values());
    }

}
