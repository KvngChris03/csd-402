import java.util.Arrays;

/**
 * Christopher Craig
 * CSD-325
 *
 * Demonstrates method overloading with four methods that search a
 * two-dimensional array and return the [row, column] location of
 * either the largest or the smallest element found:
 *
 *   locateLargest(double[][])
 *   locateLargest(int[][])
 *   locateSmallest(double[][])
 *   locateSmallest(int[][])
 *
 * Each method scans every row and column exactly once, keeping track
 * of the best value seen so far and the row/column where it was
 * found. The location is returned as a 2-element int array:
 * result[0] = row index, result[1] = column index.
 */
public class LocateExtremes {

    /** Returns the [row, col] location of the largest value in a double[][]. */
    public static int[] locateLargest(double[][] arrayParam) {
        int rowLocation = 0;
        int colLocation = 0;
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    rowLocation = row;
                    colLocation = col;
                }
            }
        }
        return new int[] {rowLocation, colLocation};
    }

    /** Returns the [row, col] location of the largest value in an int[][]. */
    public static int[] locateLargest(int[][] arrayParam) {
        int rowLocation = 0;
        int colLocation = 0;
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    rowLocation = row;
                    colLocation = col;
                }
            }
        }
        return new int[] {rowLocation, colLocation};
    }

    /** Returns the [row, col] location of the smallest value in a double[][]. */
    public static int[] locateSmallest(double[][] arrayParam) {
        int rowLocation = 0;
        int colLocation = 0;
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    rowLocation = row;
                    colLocation = col;
                }
            }
        }
        return new int[] {rowLocation, colLocation};
    }

    /** Returns the [row, col] location of the smallest value in an int[][]. */
    public static int[] locateSmallest(int[][] arrayParam) {
        int rowLocation = 0;
        int colLocation = 0;
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    rowLocation = row;
                    colLocation = col;
                }
            }
        }
        return new int[] {rowLocation, colLocation};
    }

    /** Prints a 2D double array in an easy-to-read grid. */
    private static void printGrid(double[][] array) {
        for (double[] row : array) {
            System.out.println("    " + Arrays.toString(row));
        }
    }

    /** Prints a 2D int array in an easy-to-read grid. */
    private static void printGrid(int[][] array) {
        for (int[] row : array) {
            System.out.println("    " + Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        // Two different sizes/types of arrays, so both overloaded
        // versions of each method can be verified independently.
        double[][] doubleGrid = {
            {4.5, 12.2, 7.8},
            {19.6, 3.1, 8.4}
        };

        int[][] intGrid = {
            {15, 42, 8, 91},
            {3, 77, 60, 26},
            {50, 12, 99, 5}
        };

        System.out.println("========================================");
        System.out.println(" locateLargest / locateSmallest Test");
        System.out.println("========================================");

        System.out.println("\ndouble[][] doubleGrid:");
        printGrid(doubleGrid);
        int[] largestD = locateLargest(doubleGrid);
        int[] smallestD = locateSmallest(doubleGrid);
        System.out.println("  Largest value:  " + doubleGrid[largestD[0]][largestD[1]]
                + "  at [row " + largestD[0] + ", col " + largestD[1] + "]");
        System.out.println("  Smallest value: " + doubleGrid[smallestD[0]][smallestD[1]]
                + "  at [row " + smallestD[0] + ", col " + smallestD[1] + "]");

        System.out.println("\nint[][] intGrid:");
        printGrid(intGrid);
        int[] largestI = locateLargest(intGrid);
        int[] smallestI = locateSmallest(intGrid);
        System.out.println("  Largest value:  " + intGrid[largestI[0]][largestI[1]]
                + "  at [row " + largestI[0] + ", col " + largestI[1] + "]");
        System.out.println("  Smallest value: " + intGrid[smallestI[0]][smallestI[1]]
                + "  at [row " + smallestI[0] + ", col " + smallestI[1] + "]");

        System.out.println("----------------------------------------");
    }
}
