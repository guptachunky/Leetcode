package org.coding.leetcode.DailyContest;

public class Nov3 {
    //    https://leetcode.com/problems/rotate-string/description/?envType=daily-question&envId=2024-11-03
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String s, String goal) {
        char[] sArray = s.toCharArray();
        char[] goalArray = goal.toCharArray();
        int sLength = sArray.length;
        if (sLength != goalArray.length) {
            return false;
        }
        for (int i = 0; i < sLength; i++) {
            if (sArray[i] == goalArray[0]) {
                boolean isRotated = true;
                for (int j = 0; j < sLength; j++) {
                    if (sArray[(i + j) % sLength] != goalArray[j]) {
                        isRotated = false;
                        break;
                    }
                }
                if (isRotated) {
                    return true;
                }
            }
        }
        return false;
    }
}
