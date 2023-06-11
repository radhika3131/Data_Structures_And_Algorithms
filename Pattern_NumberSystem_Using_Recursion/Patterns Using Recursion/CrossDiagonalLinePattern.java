public class CrossDiagonalLinePattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printCrossDiagonalLinePattern(n);
    }

    public static void printCrossDiagonalLinePattern(int n) {
        if (n <= 0) {
            return;
        }

        printSpaces(5 - n);
        System.out.print("*");
        printSpaces(2 * (n - 1));
        System.out.print("*");
        System.out.println();

        printCrossDiagonalLinePattern(n - 1);
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print(" ");
        printSpaces(count - 1);
    }
}
