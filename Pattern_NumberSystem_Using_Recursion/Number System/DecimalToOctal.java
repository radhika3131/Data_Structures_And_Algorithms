public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 15;
        String octal = decimalToOctal(decimal);
        System.out.println("Octal: " + octal);
    }

    private static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            return decimalToOctal(decimal / 8) + (decimal % 8);
        }
    }
}
