public class InvertedHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printInvertedHalfPyramidPattern(n);
    }
    
    public static void printInvertedHalfPyramidPattern(int n) {
        if (n <= 0) {
            return;
        }
        
        printStars(n);
        System.out.println();
        printInvertedHalfPyramidPattern(n - 1);
    }
    
    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        
        System.out.print("* ");
        printStars(n - 1);
    }
}
