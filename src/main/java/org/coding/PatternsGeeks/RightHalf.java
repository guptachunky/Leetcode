package org.coding.PatternsGeeks;

//*           |   1           |   A
//* *         |   1 2         |   A B
//* * *       |   1 2 3       |   A B C
//* * * *     |   1 2 3 4     |   A B C D
//* * * * *   |   1 2 3 4 5   |   A B C D E
public class RightHalf {
    public static void main(String[] args) {
        RightHalf rightHalf = new RightHalf();
        rightHalf.printStars(5);
        System.out.println();
        rightHalf.printNumbers(5);
        System.out.println();
        rightHalf.printAlphabets(5);

        rightHalf.printStars(6);
        System.out.println();
        rightHalf.printNumbers(6);
        System.out.println();
        rightHalf.printAlphabets(6);
    }

    void printStars(int counter) {
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void printNumbers(int counter) {
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    void printAlphabets(int counter) {
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }
}
