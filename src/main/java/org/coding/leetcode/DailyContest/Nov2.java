package org.coding.leetcode.DailyContest;

public class Nov2 {
//    https://leetcode.com/problems/circular-sentence/submissions/1440687780/
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode eats souls"));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        String lastWord = words[words.length - 1];
        return lastWord.charAt(lastWord.length() - 1) == words[0].charAt(0);
    }
}
