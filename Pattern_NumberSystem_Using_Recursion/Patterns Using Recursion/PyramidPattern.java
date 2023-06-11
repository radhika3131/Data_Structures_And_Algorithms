public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printPyramidPattern(n);
    }
    
    public static void printPyramidPattern(int n) {
        if (n <= 0) {
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            printStars(i);
            System.out.println();
        }
        
        System.out.println();
        printPyramidPattern(n - 1);
    }
    
    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
    }
}
