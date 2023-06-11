public class LeftPascalPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printLeftPascalPattern(n);
    }

    public static void printLeftPascalPattern(int n) {
        if (n <= 0) {
            return;
        }

        printStars(n);
        System.out.println();
        printLeftPascalPattern(n - 1);
    }

    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }

        System.out.print("* ");
        printStars(n - 1);
    }
}
