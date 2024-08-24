package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Fourteen implements JavaPatterns {
    //     *
    //    **
    //   ***
    //  ****
    // *****
    //******
    @Override
    public void printPattern(int n) {
        int i, j;
        for (i = n; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
