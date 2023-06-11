public class RightPascalPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printRightPascalPattern(n);
    }

    public static void printRightPascalPattern(int n) {
        if (n <= 0) {
            return;
        }

        printRightPascalPattern(n - 1);
        printStars(n);
        System.out.println();
    }

    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }

        System.out.print("* ");
        printStars(n - 1);
    }
}
