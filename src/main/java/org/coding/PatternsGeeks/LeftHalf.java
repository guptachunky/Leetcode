package org.coding.PatternsGeeks;

// Dummy Commit
//        *    |            1    |            A
//      * *    |          1 2    |          A B
//    * * *    |        1 2 3    |        A B C
//  * * * *    |      1 2 3 4    |      A B C D
//* * * * *    |    1 2 3 4 5    |    A B C D E
public class LeftHalf implements Patterns {
    public static void main(String[] args) {
        LeftHalf leftHalf = new LeftHalf();
        leftHalf.printStars(6);
        System.out.println();
        leftHalf.printNumbers(6);
        System.out.println();
        leftHalf.printAlphabets(6);
    }


    @Override
    public void printStars(int n) {
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

    @Override
    public void printNumbers(int n) {
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

    @Override
    public void printAlphabets(int n) {
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
