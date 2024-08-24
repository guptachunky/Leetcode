package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Twenty implements JavaPatterns {
    //***********
    // *       *
    //  *     *
    //   *   *
    //    * *
    //     *
    @Override
    public void printPattern(int n) {
        int i, j;
        for (i = n; i > 0; i--) {
            for (j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || i == n || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
