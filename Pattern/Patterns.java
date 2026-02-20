package Pattern;

import java.util.Scanner;

public class Patterns {
    // FIX 1: Must be "public static void main"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows and Columns: ");
        int row = input.nextInt();
        int columns = input.nextInt();

        recPatt(row, columns);
        IsoTri(columns);
        ReverseIsoTri(columns);
        VerEqueTri(columns);
        DimandPatt(columns);
        SolidDiamondPatt(columns);
        hollowDiamondPatt(columns);
        NumberPaattDima(columns);
        ButterFlyPattern(columns);


        numberSquare(row);

        input.close();
    }

    static void recPatt(int row, int column) {
        System.out.println("\nRectangle or Square Pattern:");
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void IsoTri(int column) {
        System.out.println("\nIsoScalen Triangle:");
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ReverseIsoTri(int column) {
        System.out.println("\nReverse ISO Triangle:");
        for (int i = column; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void VerEqueTri(int column) {
        System.out.println("\nVertical Equilateral Triangle:");
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = column - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void DimandPatt(int column) {
        System.out.println("\nDiamond Pattern:");
        for (int i = 1; i < 2 * column; i++) {
            int totalColsInRow = i > column ? 2 * column - i : i;
            int noOfSpace = column - totalColsInRow;
            for (int s = 0; s < noOfSpace; s++) System.out.print(" ");
            for (int j = 0; j < totalColsInRow; j++) System.out.print("* ");
            System.out.println();
        }
    }

    static void SolidDiamondPatt(int column) {
        System.out.println("\nSolid Diamond Pattern:");
        for (int i = 1; i < 2 * column; i++) {
            int totalColsInRow = i > column ? 2 * column - i : i;
            int noOfSpace = column - totalColsInRow;
            for (int s = 0; s < noOfSpace; s++) System.out.print(" ");
            for (int j = 0; j < (2 * totalColsInRow) - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void hollowDiamondPatt(int column) {
        System.out.println("\nHollow Diamond in Rectangle:");
        for (int i = 1; i < 2 * column; i++) {
            int starsOnSide = i <= column ? column - i + 1 : i - column + 1;
            int spacesInMiddle = (column - starsOnSide) * 2;

            for (int j = 0; j < starsOnSide; j++) System.out.print("*");
            for (int s = 0; s < spacesInMiddle; s++) System.out.print(" ");
            for (int j = 0; j < starsOnSide; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void NumberPaattDima(int col) {
        System.out.println("\nNumber Diamond:");
        for (int i = 1; i < 2 * col; i++) {
            int n = i > col ? 2 * col - i : i;
            for (int space = 0; space < col - n; space++) System.out.print("  ");
            for (int j = n; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= n; j++) System.out.print(j + " "); // FIX: print, not println
            System.out.println();
        }
    }

    static void numberSquare(int n) {
        System.out.println("\nNumber Square Pattern:");
        // FIX: i++ not i--, and correct distance logic
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                // The value is the original number minus the distance to the nearest edge
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
    //Butterfly
    static void ButterFlyPattern(int column) {
        System.out.println("\nVertical Equilateral Triangle:");
        // 1. Upper Half
        for (int i = 1; i <= column; i++) {
            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle Spaces
            int spaces = 2 * (column - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = column-1; i >= 1; i--) {
            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            int spaces = 2 * (column - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}