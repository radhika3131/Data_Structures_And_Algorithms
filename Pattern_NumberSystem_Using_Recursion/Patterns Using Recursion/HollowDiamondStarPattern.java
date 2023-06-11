public class HollowDiamondStarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printHollowDiamondStarPattern(n);
    }

    public static void printHollowDiamondStarPattern(int n) {
        if (n <= 0) {
            return;
        }

        printSpaces(n - 1);
        printStars(2 * (5 - n) + 1);
        System.out.println();

        printHollowDiamondStarPattern(n - 1);

        printSpaces(n - 1);
        printStars(2 * (5 - n) + 1);
        System.out.println();
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

        if (count == 1 || count == 9) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

        printStars(count - 1);
    }
}
