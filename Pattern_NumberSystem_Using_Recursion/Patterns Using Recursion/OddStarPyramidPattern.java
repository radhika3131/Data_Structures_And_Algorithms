public class OddStarPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printOddStarPyramidPattern(n);
    }
    
    public static void printOddStarPyramidPattern(int n) {
        if (n <= 0) {
            return;
        }
        
        printSpaces(n - 1);
        printStars(2 * n - 1);
        System.out.println();
        
        printOddStarPyramidPattern(n - 1);
    }
    
    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }
        
        System.out.print(" ");
        printSpaces(count - 1);
    }
    
    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("*");
        printStars(count - 1);
    }
}

