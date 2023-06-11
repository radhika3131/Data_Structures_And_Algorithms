public class DiagonalLinePattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printDiagonalLinePattern(n);
    }

    public static void printDiagonalLinePattern(int n) {
        if (n <= 0) {
            return;
        }

        printSpaces(5 - n);
        System.out.print("*");
        System.out.println();

        printDiagonalLinePattern(n - 1);
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print(" ");
        printSpaces(count - 1);
    }
}
