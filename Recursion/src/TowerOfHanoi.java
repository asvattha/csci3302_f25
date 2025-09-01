/**
 * The {@code TowerOfHanoi} class provides a method to solve the classic Tower of Hanoi problem
 * using recursion.
 *
 * <p>The Tower of Hanoi problem consists of moving a number of disks (rods) from a source peg
 * to a destination peg using a temporary peg, following these rules:
 * <ul>
 *   <li>Only one disk can be moved at a time.</li>
 *   <li>A disk can only be moved if it is the top disk on a stack.</li>
 *   <li>No disk may be placed on top of a smaller disk.</li>
 * </ul>
 *
 * <p>This implementation prints the steps to solve the problem for a given number of rods
 * and peg positions.
 *
 * <p>Example usage:
 * <pre>{@code
 * TowerOfHanoi toh = new TowerOfHanoi();
 * toh.hanoi(3, 1, 3);
 * }</pre>
 *
 * <p>Output:
 * <pre>
 * Move top rod from 1 to 3
 * Move top rod from 1 to 2
 * Move top rod from 3 to 2
 * Move top rod from 1 to 3
 * Move top rod from 2 to 1
 * Move top rod from 2 to 3
 * Move top rod from 1 to 3
 * </pre>
 * 
 * @author Dipak Singh
 */
public class TowerOfHanoi {
    
    /**
     * Solves the Tower of Hanoi problem and prints each move to the console.
     *
     * @param nrods the number of disks to move (must be >= 1)
     * @param start the peg number to move from (e.g., 1)
     * @param end   the peg number to move to (e.g., 3)
     * @throws IllegalArgumentException if {@code nrods < 1}, or if peg numbers are invalid
     */
    public void hanoi(int nrods, int start, int end) {
        if(nrods == 1){ // Base case: move a single rod
            System.out.printf("Move top rod from %d to %d%n", start, end);
            return;
        }

        // Determine the auxiliary peg
        int other = 6 - (start + end);   // Since pegs are 1, 2, 3, their sum is always 6
        hanoi(nrods - 1, start, other); // Move n-1 rods to auxiliary peg
        System.out.printf("Move top rod from %d to %d %n", start, end); // Move the largest rod to destination peg
        hanoi(nrods - 1, other, end); // Move n-1 rods from auxiliary peg to destination peg
    }
}
