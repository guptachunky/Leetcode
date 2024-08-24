package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Ninth implements JavaPatterns {
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    //***********
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    @Override
    public void printPattern(int n) {
        int i, j;
        for (i = 1; i < n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
