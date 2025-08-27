public class App {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[4][5];
        setArray(arr);
        printArray(arr);
    }

    // Precondition: arr must be a 2D array with nrows > 0 and ncols > 0
    // Postcondition: Each row of the arr is set to 1, 2, 3, 4, 5
    public static void setArray(int[][] arr) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++) {
                arr[i][j] = j + 1;
            }
        }
    }

    // Precondition: arr must be a 2D array with nrows > 0 and ncols > 0
    // Postcondition: prints the contents of an array
    public static void printArray(int[][] arr) {
        System.out.println("The array values are as follows");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
        System.out.println();
        }
    }
}
