package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Eleventh implements JavaPatterns {
    //            *******
//            *******
//            *******
//            *******
//            *******
//            *******
//            *******
    @Override
    public void printPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
