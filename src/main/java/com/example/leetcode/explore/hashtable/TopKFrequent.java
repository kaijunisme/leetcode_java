package com.example.leetcode.explore.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static void main(String[] args) {
        var application = new TopKFrequent();
        int[] nums = new int[] {1, 1, 1, 2, 2, 3};
        int k = 2;
        // int[] nums = new int[] {1};
        // int k = 1;
        int[] result = application.topKFrequent(nums, k);
        for (int i: result) {
            System.out.println(i);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        // key -> number, value -> counter
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = map.entrySet().stream()
            .sorted(Entry.comparingByValue())
            .map(Entry::getKey)
            .collect(Collectors.toList());

        int[] result = new int[k];
        int size = list.size();

        for (int i = 0; i < k; i++) {
            result[i] = list.get(size - i - 1);
        }

        return result;
    }

}
