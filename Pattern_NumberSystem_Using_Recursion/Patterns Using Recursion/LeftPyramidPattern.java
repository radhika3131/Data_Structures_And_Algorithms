public class LeftPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printLeftPyramidPattern(n);
    }
    
    public static void printLeftPyramidPattern(int n) {
        if (n <= 0) {
            return;
        }
        
        printStars(n);
        System.out.println();
        printLeftPyramidPattern(n - 1);
    }
    
    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        
        System.out.print("* ");
        printStars(n - 1);
    }
}
