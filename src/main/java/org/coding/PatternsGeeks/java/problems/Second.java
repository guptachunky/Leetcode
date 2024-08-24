package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Second implements JavaPatterns {
    //     1
    //    2 2
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5
    //6 6 6 6 6 6
    @Override
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
