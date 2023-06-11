public class NumberRightLeftTrianglePattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printNumberRightLeftTrianglePattern(n);
    }

    public static void printNumberRightLeftTrianglePattern(int n) {
        if (n <= 0) {
            return;
        }

        printNumberRightTriangle(n);
        printNumberLeftTriangle(n);

        printNumberRightLeftTrianglePattern(n - 1);
    }

    public static void printNumberRightTriangle(int n) {
        if (n <= 0) {
            return;
        }

        printNumberRightTriangle(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumberLeftTriangle(int n) {
        if (n <= 0) {
            return;
        }

        printNumberLeftTriangle(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print("  ");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
