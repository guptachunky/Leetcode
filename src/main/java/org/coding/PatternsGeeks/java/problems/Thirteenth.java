package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Thirteenth implements JavaPatterns {
    //            ******
    //            *****
    //            ****
    //            ***
    //            **
    //            *
    @Override
    public void printPattern(int n) {
        int i, j;
        for (i = n; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
