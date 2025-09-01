/**
 * The {@code StringBackwards} class provides methods to reverse a string using two recursive strategies:
 * <ul>
 *     <li><b>Tail Recursion</b>: Processes the last character first and works backwards.</li>
 *     <li><b>Head Recursion</b>: Processes the first character last and builds the result in reverse order.</li>
 * </ul>
 *
 * <p>Both methods assume that the input string is non-empty and contains at least one character.
 * If called with a single-character string, they will return the string itself.
 *
 * <p>Example usage:
 * <pre>{@code
 * StringBackwards sb = new StringBackwards();
 * String reversed1 = sb.TailRecursion("hello"); // Outputs: "olleh"
 * String reversed2 = sb.HeadRecursion("world"); // Outputs: "dlrow"
 * }</pre>
 * 
 * @author Dipak Singh
 */
public class StringBackwards {
    
    /**
     * Reverses the given string using a tail-recursive approach.
     * <p>This method takes the last character and appends the result of recursively reversing the rest of the string.
     *
     * @param word the input string to be reversed
     * @return the reversed string
     * @throws IllegalArgumentException if the input string is null or empty
     */
    public String tailRecursion(String word) {
        if (word.length() == 1)
            return word;
        else {
            String lastCharacter = word.substring(word.length() - 1);
            return lastCharacter + tailRecursion(word.substring(0, word.length() - 1));
        }
    }

    /**
     * Reverses the given string using a head-recursive approach.
     * <p>This method delays processing the first character until the recursive calls reach the end.
     *
     * @param word the input string to be reversed
     * @return the reversed string
     * @throws IllegalArgumentException if the input string is null or empty
     */
    public String headRecursion(String word) {
        if(word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word must be non-empty");
        }
        if(word.length() == 1)
            return word;
        else {
            String firstCharacter = word.substring(0, 1);
            return headRecursion(word.substring(1, word.length())) + firstCharacter;
        }
    }
}
