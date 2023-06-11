public class NumberCharPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printNumberCharPattern(n);
    }

    public static void printNumberCharPattern(int n) {
        if (n <= 0) {
            return;
        }

        printNumberCharPattern(n - 1);
        printNumbers(n);
        printChars(n);
        System.out.println();
    }

    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }

        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void printChars(int n) {
        if (n <= 0) {
            return;
        }

        System.out.print((char) (n + 64) + " ");
        printChars(n - 1);
    }
}
