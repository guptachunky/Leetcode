package org.coding.PatternsGeeks;

//        *    |            1    |            A
//      * *    |          1 2    |          A B
//    * * *    |        1 2 3    |        A B C
//  * * * *    |      1 2 3 4    |      A B C D
//* * * * *    |    1 2 3 4 5    |    A B C D E
public class LeftHalf {
    public static void main(String[] args) {
        LeftHalf leftHalf = new LeftHalf();
        leftHalf.printStarts(6);
        System.out.println();
        leftHalf.printNumbers(6);
        System.out.println();
        leftHalf.printAlphabets(6);
    }

    void printStarts(int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    void printNumbers(int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print((j - i + 1) + " ");
                }
            }
            System.out.println();
        }
    }

    void printAlphabets(int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print((char) (j - i + 65) + " ");
                }
            }
            System.out.println();
        }
    }
}
