package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Seventh implements JavaPatterns {
    //          1
    //        2 1 2
    //      3 2 1 2 3
    //    4 3 2 1 2 3 4
    //  5 4 3 2 1 2 3 4 5
    //6 5 4 3 2 1 2 3 4 5 6
    @Override
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
