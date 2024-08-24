package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Sixth implements JavaPatterns {
    //            1
    //            0 1
    //            1 0 1
    //            0 1 0 1
    //            1 0 1 0 1
    //            0 1 0 1 0 1
    @Override
    public void printPattern(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            int temp = counter;
            for (int j = 0; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp == 1 ? 0 : 1;
            }
            System.out.println();
            counter = counter == 1 ? 0 : 1;
        }
    }
}
