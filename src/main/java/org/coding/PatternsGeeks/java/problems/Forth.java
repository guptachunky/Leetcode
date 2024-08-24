package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Forth implements JavaPatterns {
    //    1 2 3 4 5 6
    //    1 2 3 4 5
    //    1 2 3 4
    //    1 2 3
    //    1 2
    //    1
    @Override
    public void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
