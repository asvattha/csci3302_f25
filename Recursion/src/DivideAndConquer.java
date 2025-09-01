/**
 * The {@code DivideAndConquer} class provides an implementation of
 * the divide-and-conquer strategy to solve multiple problems such as, 
 * find the maximum value in an integer array (findMax()), or
 * find the kth smallest item in an array (kthSearch), or
 * search an item in an array (binarysearch())
 * 
 * <p>This approach recursively divides the array into two halves, performs operation
 * in each half, and returns the overall result. It demonstrates the use of recursion
 * and a classic divide-and-conquer paradigm.
 * 
 * <p>Example usage:
 * <pre>{@code
 * DivideAndConquer dac = new DivideAndConquer();
 * int max = dac.findMax(new int[] {3, 1, 9, 5, 2}, 0, 4);
 * System.out.println("Max value: " + max); // Outputs: 9
 * }</pre>
 * 
 * @author Dipak Singh
 */
public class DivideAndConquer {
    
    /**
     * Recursively finds the maximum value in a subarray of integers using
     * the divide-and-conquer technique.
     * 
     * @param arr  the input array of integers
     * @param low  the starting index (inclusive) of the subarray
     * @param high the ending index (inclusive) of the subarray
     * @return the maximum value in the specified range of the array
     * @throws IndexOutOfBoundsException if {@code low} or {@code high} are out of array bounds,
     *         or if {@code low > high}
     */
    public int findMax(int[] arr, int low, int high) {

        int mid = (int)Math.floor((low + high) / 2); // Calculate the middle index

        if (low > high || high < low) {  // Handle invalid index range
            throw new IndexOutOfBoundsException();
        }

        else if (low == high) { // Base case: single element
            return arr[low];
        }

        else {  // Recursive case: divide the array into two halves
            int leftMax = findMax(arr, low, mid); // Find max in left half
            int rightMax = findMax(arr, mid+1, high); // Find max in right half

            return Math.max(leftMax, rightMax);
        }
    }
}
