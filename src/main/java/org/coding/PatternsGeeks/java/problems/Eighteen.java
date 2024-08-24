package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Eighteen implements JavaPatterns {
    // 1 2 3 4 5 6
    // 2 3 4 5 6
    //  3 4 5 6
    //   4 5 6
    //    5 6
    //     6
    //    5 6
    //   4 5 6
    //  3 4 5 6
    // 2 3 4 5 6
    //1 2 3 4 5 6
    @Override
    public void printPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n - 1; i > 0; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
