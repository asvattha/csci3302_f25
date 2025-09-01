/**
 * The {@code Summation} class provides methods to compute the sum of the first {@code n}
 * natural numbers using two different approaches:
 * <ul>
 *     <li><b>Recursive Method</b>: Adds numbers from {@code n} down to 1 recursively.</li>
 *     <li><b>Formula-Based Method</b>: Uses the arithmetic series formula: {@code n(n+1)/2}.</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>{@code
 * Summation sumObj = new Summation();
 * int recursiveSum = sumObj.sum(5);        // Returns 15
 * int formulaSum   = sumObj.sumNoRecursion(5); // Returns 15
 * }</pre>
 *
 * <p>Note: These methods assume {@code n >= 1}. No checks are currently implemented
 * for non-positive input values.
 * 
 * @author Dipak Singh
 */
public class Summation {

    /**
     * Computes the sum of the first {@code n} natural numbers using recursion.
     *
     * @param n the number up to which to compute the sum (inclusive)
     * @return the sum from 1 to {@code n}
     * @throws IllegalArgumentException if {@code n < 1}
     */
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be >= 1");
        }

        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    /**
     * Computes the sum of the first {@code n} natural numbers using the formula {@code n(n+1)/2}.
     *
     * @param n the number up to which to compute the sum (inclusive)
     * @return the sum from 1 to {@code n}
     * @throws IllegalArgumentException if {@code n < 1}
     */
    public int sumNoRecursion(int n){
        if (n < 1) {
            throw new IllegalArgumentException("Input must be >= 1");
        }
        return (n * (n + 1) ) / 2;
    }
}