/**
 * The {@code Fibonacci} class provides a method to compute the n-th term
 * in the Fibonacci sequence using a recursive approach.
 * 
 * <p>The Fibonacci sequence is defined as:
 * <ul>
 *   <li>fib(0) = 1</li>
 *   <li>fib(1) = 1</li>
 *   <li>fib(n) = fib(n-1) + fib(n-2) for n > 1</li>
 * </ul>
 *
 * <p>This recursive implementation is simple but inefficient for large values of {@code n}
 * due to repeated recomputation and exponential time complexity.
 *
 * <p>Example usage:
 * <pre>{@code
 * Fibonacci fib = new Fibonacci();
 * int result = fib.findFib(5); // Returns 8
 * }</pre>
 * 
 * <p>Note: The sequence implemented here starts with 1, 1, 2, 3, 5, 8, ...
 * which differs slightly from the more standard version starting with 0, 1, 1, ...
 * 
 * @author Dipak Singh
 */
public class Fibonacci {
    
    /**
     * Computes the n-th Fibonacci number using recursion.
     *
     * @param n the position (0-based) in the Fibonacci sequence
     * @return the n-th Fibonacci number, where fib(0) = 1 and fib(1) = 1
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public int findFib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        if (n == 0 || n == 1){
            return 1;
        }
        
        return findFib(n - 1) + findFib(n - 2);
    }
}
