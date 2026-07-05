import java.util.Arrays;

/**
 * Christopher Craig
 * CSD-325
 *
 * Demonstrates method overloading by defining four average() methods,
 * one for each numeric array type (short, int, long, double). Each
 * method has the same name but a different parameter type, so the
 * compiler chooses the correct version based on the argument passed in.
 *
 * A short test program (main) calls all four versions, each with an
 * array of a different length, and prints the original array next to
 * the average that was calculated from it.
 */
public class AverageOverload {

    /**
     * Returns the average of a short array.
     * The sum is accumulated in an int to avoid overflow while adding,
     * then the result is narrowed back to short for the return value.
     */
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    /**
     * Returns the average of an int array.
     * The sum is accumulated in a long to avoid overflow while adding,
     * then the result is narrowed back to int for the return value.
     */
    public static int average(int[] array) {
        long sum = 0L;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    /**
     * Returns the average of a long array.
     */
    public static long average(long[] array) {
        long sum = 0L;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Returns the average of a double array.
     */
    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Prints a labeled, easy-to-read block showing the original array
     * and the average that was computed from it.
     */
    private static void displayResult(String label, String arrayText, String averageText) {
        System.out.println("----------------------------------------");
        System.out.println(label);
        System.out.println("  Array:   " + arrayText);
        System.out.println("  Average: " + averageText);
    }

    public static void main(String[] args) {

        // Each array below is a different size (3, 5, 4, and 6 elements)
        // so we can confirm every overloaded method works correctly on
        // its own data, independent of the others.

        short[] shortArray = {10, 20, 30};
        int[] intArray = {100, 200, 300, 400, 500};
        long[] longArray = {1_000_000L, 2_000_000L, 3_000_000L, 4_000_000L};
        double[] doubleArray = {1.5, 2.25, 3.75, 4.0, 5.5, 6.1};

        System.out.println("========================================");
        System.out.println(" Overloaded average() Method Test");
        System.out.println("========================================");

        short shortAvg = average(shortArray);
        displayResult("short[] average(short[])",
                Arrays.toString(shortArray), String.valueOf(shortAvg));

        int intAvg = average(intArray);
        displayResult("int average(int[])",
                Arrays.toString(intArray), String.valueOf(intAvg));

        long longAvg = average(longArray);
        displayResult("long average(long[])",
                Arrays.toString(longArray), String.valueOf(longAvg));

        double doubleAvg = average(doubleArray);
        displayResult("double average(double[])",
                Arrays.toString(doubleArray), String.valueOf(doubleAvg));

        System.out.println("----------------------------------------");
    }
}
