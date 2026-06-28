/**
 * PowerPyramid.java
 * CSD-325 — Module 3
 * Author: Christopher Craig (C.J.)
 *
 * Uses nested for loops to print a pyramid of powers of 2.
 * Each row is padded to a fixed total width of 31 characters
 * before the '@' symbol that closes every line.
 */
public class PowerPyramid {

    public static void main(String[] args) {

        final int ROWS       = 7;   // total number of rows to print
        final int LINE_WIDTH = 31;  // fixed character width before '@'

        // ── Outer loop: one row at a time ────────────────────────────────
        for (int row = 0; row < ROWS; row++) {

            // Step 1: Build the number sequence for this row.
            // Each row has an ascending half (1, 2, 4, ..., 2^row)
            // followed by a descending half (..., 4, 2, 1).
            StringBuilder sequence = new StringBuilder();

            // Ascending half: positions 0 → row
            for (int col = 0; col <= row; col++) {

                if (col > 0) {
                    sequence.append(" ");
                }

                // Compute 2^col using a nested loop (no Math.pow)
                int value = 1;
                for (int k = 0; k < col; k++) {
                    value *= 2;
                }
                sequence.append(value);
            }

            // Descending half: positions row-1 → 0  (peak not repeated)
            for (int col = row - 1; col >= 0; col--) {

                sequence.append(" ");

                // Compute 2^col using a nested loop
                int value = 1;
                for (int k = 0; k < col; k++) {
                    value *= 2;
                }
                sequence.append(value);
            }

            // Step 2: Calculate leading and trailing spaces so the total
            // width before '@' is always LINE_WIDTH (31) characters.
            int seqLen   = sequence.length();
            int leading  = (ROWS - 1 - row) * 2 + (row < ROWS - 1 ? 1 : 0);
            int trailing = LINE_WIDTH - seqLen - leading;

            // Step 3: Assemble and print the line.
            StringBuilder line = new StringBuilder();

            for (int s = 0; s < leading;  s++) line.append(" ");
            line.append(sequence);
            for (int s = 0; s < trailing; s++) line.append(" ");
            line.append("@");

            System.out.println(line.toString());
        }
    }
}
