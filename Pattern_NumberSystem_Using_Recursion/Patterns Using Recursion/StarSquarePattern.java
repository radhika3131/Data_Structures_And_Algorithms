public class StarSquarePattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        printStarSquarePattern(n);
    }
    
    public static void printStarSquarePattern(int n) {
        if (n <= 0) {
            return;
        }
        
        printStars(n);
        System.out.println();
        printStarSquarePattern(n - 1);
    }
    
    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        
        System.out.print("* ");
        printStars(n - 1);
    }
}
