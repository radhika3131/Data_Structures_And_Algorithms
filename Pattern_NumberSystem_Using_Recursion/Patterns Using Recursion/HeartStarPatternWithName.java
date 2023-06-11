public class HeartStarPatternWithName {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        printHeartStarPatternWithName(n);
    }

    public static void printHeartStarPatternWithName(int n) {
        if (n <= 0) {
            return;
        }

        printSpaces(n);
        printStars(2 * (5 - n) + 1);
        System.out.println();

        printHeartStarPatternWithName(n - 1);
        
        if (n == 1) {
            printName();
        }
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

        System.out.print("*");
        printStars(count - 1);
    }

    public static void printName() {
        System.out.println("Radhika Ramsen");
    }
}
