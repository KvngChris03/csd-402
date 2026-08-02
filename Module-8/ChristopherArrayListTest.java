import java.util.ArrayList;
import java.util.Scanner;

/**
 * Christopher Craig
 * CSD-325
 *
 * ChristopherArrayListTest.java - reads integers from the user into an
 * ArrayList until 0 is entered (0 is included in the list), then passes
 * the list to max() to find and display the largest value.
 */
public class ChristopherArrayListTest {

    /**
     * Returns the largest Integer value in the given ArrayList.
     * Returns 0 if the list is empty.
     */
    public static Integer max(ArrayList list) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer largest = (Integer) list.get(0);
        for (Object obj : list) {
            Integer value = (Integer) obj;
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers one at a time. Enter 0 to stop.");
        int input;
        do {
            System.out.print("Enter an integer: ");
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != 0);

        System.out.println("\nValues entered: " + numbers);

        Integer largest = max(numbers);
        System.out.println("The largest value entered is: " + largest);

        // Additional test: an empty ArrayList should return 0
        ArrayList<Integer> empty = new ArrayList<Integer>();
        System.out.println("\nTesting max() with an empty ArrayList...");
        System.out.println("max() on an empty list returns: " + max(empty));

        scanner.close();
    }
}
