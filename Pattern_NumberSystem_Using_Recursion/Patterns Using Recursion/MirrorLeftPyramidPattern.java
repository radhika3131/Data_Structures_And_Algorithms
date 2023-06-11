public class MirrorLeftPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printMirrorLeftPyramidPattern(n);
    }
    
    public static void printMirrorLeftPyramidPattern(int n) {
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
        printMirrorLeftPyramidPattern(n - 1);
    }
    
    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        
        System.out.print("* ");
        printStars(n - 1);
    }
}
