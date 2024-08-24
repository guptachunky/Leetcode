package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Fifth implements JavaPatterns {
    //  1
    //  2 3
    //  4 5 6
    //  7 8 9 10
    //  11 12 13 14 15
    //  16 17 18 19 20 21
    @Override
    public void printPattern(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
