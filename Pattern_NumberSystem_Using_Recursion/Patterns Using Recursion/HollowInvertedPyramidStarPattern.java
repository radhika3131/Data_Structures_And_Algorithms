public class HollowInvertedPyramidStarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printHollowInvertedPyramidStarPattern(n);
    }

    public static void printHollowInvertedPyramidStarPattern(int n) {
        if (n <= 0) {
            return;
        }

        printSpaces(5 - n);
        printStars(2 * n - 1);
        System.out.println();

        printHollowInvertedPyramidStarPattern(n - 1);
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

        if (count == 1 || count == 2 || count == 2 * (5 - count) + 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        printStars(count - 1);
    }
}
