package org.coding.neetcode.ArrayAndHashing;

public class Anagram {
    public static void main(String[] args) {
        //https://neetcode.io/problems/is-anagram
        // Just keeping a counter of each character inside the Integer array of size 26
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int[] COUNTER = new int[26];
        for (int i = 0; i < sChars.length; i++) {
            COUNTER[sChars[i] - 'a']++;
            COUNTER[tChars[i] - 'a']--;
        }
        for (int i : COUNTER) if (i != 0) return false;
        return true;
    }
}
