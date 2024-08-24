package org.coding.PatternsGeeks.java.problems;

import org.coding.PatternsGeeks.java.JavaPatterns;

public class Tenth implements JavaPatterns {
    //            *          *
    //            **        **
    //            ***      ***
    //            ****    ****
    //            *****  *****
    //            ************
    //            ************
    //            *****  *****
    //            ****    ****
    //            ***      ***
    //            **        **
    //            *          *
    @Override
    public void printPattern(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            PrintCommon(i, n);
        }
        for (i = n; i >= 1; i--) {
            // inner loop to print stars
            PrintCommon(i, n);
        }
    }

    private static void PrintCommon(int i, int n) {
        int j;
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
        int spaces = 2 * (n - i);
        for (j = 1; j <= spaces; j++) {
            System.out.print(" ");
        }
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
