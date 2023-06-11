public class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printInvertedPyramidStarPattern(n);
    }

    public static void printInvertedPyramidStarPattern(int n) {
        if (n <= 0) {
            return;
        }

        printStars(n);
        System.out.println();
        printInvertedPyramidStarPattern(n - 1);
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
