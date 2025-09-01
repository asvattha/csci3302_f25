/**
 * The {@code Factorial} class provides two methods to compute the factorial of a non-negative integer:
 * one using a recursive approach and the other using an iterative (non-recursive) method.
 *
 * <p>The factorial of a number {@code n} (denoted {@code n!}) is defined as:
 * <ul>
 *   <li>n! = 1, if n == 0</li>
 *   <li>n! = n × (n-1) × (n-2) × ... × 1, if n > 0</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>{@code
 * Factorial f = new Factorial();
 * int result1 = f.findFact(5);           // Recursive: 120
 * int result2 = f.findFactNoRecursion(5); // Iterative: 120
 * }</pre>
 *
 * <p>Note: These methods assume the input {@code n} is a non-negative integer.
 * No input validation is done for negative values.
 * 
 * @author Dipak Singh
 */
public class Factorial {
    
    /**
     * Computes the factorial of a non-negative integer {@code n} using recursion.
     *
     * @param n the integer whose factorial is to be computed
     * @return the factorial of {@code n}; returns 1 if {@code n == 0}
     * @throws IllegalArgumentException if {@code n < 0}
     */
    public int findFact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0) {
            return 1;
        }

        return n * findFact(n - 1);
    }


    /**
     * Computes the factorial of a non-negative integer {@code n} using an iterative approach.
     *
     * @param n the integer whose factorial is to be computed
     * @return the factorial of {@code n}; returns 1 if {@code n == 0}
     * @throws IllegalArgumentException if {@code n < 0}
     */
    public int findFactNoRecursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        int fact = 1;
        if (n == 0)
            return fact;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
