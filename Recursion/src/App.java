public class App {
    public static void main(String[] args) throws Exception {
        // Summation of n integers
        Summation summation = new Summation();
        System.out.println(summation.sum(10));

        // Factorial of a number
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFact(5));

        // Fibonacci number
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.findFib(7));

        // Reversal of String
        StringBackwards reverseString = new StringBackwards();
        System.out.println(reverseString.headRecursion("umbrella"));
        System.out.println(reverseString.tailRecursion("umbrella"));


        // Divide and Conquer Based Problems
        DivideAndConquer dac = new DivideAndConquer();
        int[] arr = {10, 200, 30, 40, 5};
        System.out.println(dac.findMax(arr, 0, arr.length - 1));

        // TowerOfHanoi
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.hanoi(4, 1, 3);

    }
}
