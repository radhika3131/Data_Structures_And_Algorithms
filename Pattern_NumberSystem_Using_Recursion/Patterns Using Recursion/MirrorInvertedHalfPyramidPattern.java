public class MirrorInvertedHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printMirrorInvertedHalfPyramidPattern(n);
    }
    
    public static void printMirrorInvertedHalfPyramidPattern(int n) {
        if (n <= 0) {
            return;
        }
        
        printStars(n);
        System.out.println();
        printMirrorInvertedHalfPyramidPattern(n - 1);
    }
    
    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
