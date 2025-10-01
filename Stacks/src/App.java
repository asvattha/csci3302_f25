public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayBasedStack<Character> alphabets = new ArrayBasedStack<>();

        // Check if stack is empty
        System.out.println(alphabets.isEmpty());

        // Push all the alphabets to the stack
        for(char ch='a'; ch <= 'z'; ch++) {
            alphabets.push(ch);
        }
        System.out.println(alphabets);

        // Pop five times from the stack
        for(int i = 0; i < 5; i++) {
            char ch = alphabets.pop();
        }
        System.out.println(alphabets);

        // Pop all items from the stack
        alphabets.popAll();
        System.out.println(alphabets);
    }
}
