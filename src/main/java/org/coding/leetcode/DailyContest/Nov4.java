package org.coding.leetcode.DailyContest;

public class Nov4 {
    //https://leetcode.com/problems/string-compression-iii/submissions/1442872961/
    public static void main(String[] args) {
        System.out.println(compressedString("aaaaaaaaabb"));
    }

    // 20ms
    //Beats58.47%
    public static String compressedString1(String word) {
        StringBuilder response = new StringBuilder();
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            int counter = 1;
            while (i + 1 < wordLength && word.charAt(i) == word.charAt(i + 1)) {
                counter++;
                i++;
            }
            while (counter > 9) {
                response.append(9).append(word.charAt(i));
                counter -= 9;
            }
            response.append(counter).append(word.charAt(i));
        }
        return response.toString();
    }

    //    17ms
//    Beats80.51%
    public static String compressedString(String word) {
        StringBuilder response = new StringBuilder();
        char[] wordArray = word.toCharArray();
        int wordLength = wordArray.length;
        for (int i = 0; i < wordLength; i++) {
            int counter = 1;
            while (i + 1 < wordLength && wordArray[i] == wordArray[i + 1]) {
                counter++;
                i++;
            }
            while (counter > 9) {
                response.append(9).append(wordArray[i]);
                counter -= 9;
            }
            response.append(counter).append(wordArray[i]);
        }
        return response.toString();
    }
}
