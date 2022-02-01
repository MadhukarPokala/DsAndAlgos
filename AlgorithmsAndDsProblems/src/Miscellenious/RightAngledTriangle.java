package Miscellenious;

import java.util.*;

/**
 * Program to print Right angled triangle
 */
public class RightAngledTriangle {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nextElement = keyboard.nextInt();
        printRightAngledTriangle(nextElement);
    }

    /**
     *
     * @param nextElement size of the triangle
     */
    private static void printRightAngledTriangle(int nextElement) {
        for (int j = 0; j < nextElement; j++) {
            for (int k = 0; k < nextElement; k++) {
                if (j + k >= nextElement - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
    Sample input 5
    sample output
        *
       **
      ***
     ****
    *****
     */
}