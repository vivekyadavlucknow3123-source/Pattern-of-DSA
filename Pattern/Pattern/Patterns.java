package Pattern;

import java.util.Scanner;

public class Patterns {
    static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter or And Columns: ");
        int row=input.nextInt();
        int columns=input.nextInt();
        recPatt(row,columns);
        IsoTri(columns);
        ReverseIsoTri(columns);
        VerEqueTri(columns);
        DimandPatt(columns);
        SolidDiamondPatt(columns);
    }
    //rectangle Pattern or square Pattern
    static void recPatt(int row,int column){
        System.out.println("Rectangle or Square Pattern: ");
        for (int i = 1; i <= column; i++) {
            for (int j =1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //IsoScalen_Triangle pattern
    static void IsoTri(int column){
        System.out.println("IsoScalen Triangle: ");
        for (int i = 1; i <=column ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");//replace * with j to get number from 1 to column
            }
            System.out.println();
        }
    }
    //Reverse ISoTriangle
    static void ReverseIsoTri(int column) {
        System.out.println("Reverse ISO Triangle: ");

        // Change: Start at 'column' and decrease down to 1
        for (int i = column; i >= 1; i--) {

            // Inner loop stays exactly the same
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // replace * with j to get numbers
            }
            System.out.println();
        }
    }
    //verticle equelatrol Pattern
    static void VerEqueTri(int column){
        System.out.println("Verticle Equelateral Triangle: ");
        for (int i = 1; i <=column ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");//replace * with j to get number from 1 to column
            }
            System.out.println();
        }
        for (int i = column-1; i >= 1; i--) {

            // Inner loop stays exactly the same
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // replace * with j to get numbers
            }
            System.out.println();
        }
    }
    //Diamond Pattern
    static void DimandPatt(int column) {
        System.out.println("Diamond Pattern: ");

        // Fix 1: Start 'i' at 1, and go up to (but not including) 2*column
        for (int i = 1; i < 2 * column; i++) {

            int totoalColsInRow = i > column ? 2 * column - i : i;
            int noOfSpace = column - totoalColsInRow;

            // Print spaces
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }

            // Fix 2: Add a space after the star "* "
            for (int j = 0; j < totoalColsInRow; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
//SolidDiamondPatt
    static void SolidDiamondPatt(int column) {
        System.out.println("Solid Diamond Pattern: ");

        for (int i = 1; i < 2 * column; i++) {
            int totoalColsInRow = i > column ? 2 * column - i : i;
            int noOfSpace = column - totoalColsInRow;

            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }

            // Print an ODD number of stars, no spaces added
            for (int j = 0; j < (2 * totoalColsInRow) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}
