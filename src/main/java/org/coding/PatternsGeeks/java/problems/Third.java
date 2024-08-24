package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Third implements JavaPatterns {
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5
    //1 2 3 4 5 6
    @Override
    public void printPattern(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
