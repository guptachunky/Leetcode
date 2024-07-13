package org.coding.neetcode.ArrayAndHashing;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
//        https://neetcode.io/problems/anagram-groups
//        Medium
//        keep on iterating over string and with its counter,
//        and comparing toString of array Counter with other to check if similar values or not
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> response = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            response.computeIfAbsent(key, k -> new ArrayList<>());
            response.get(key).add(s);
        }
        return new ArrayList<>(response.values());
    }
}
