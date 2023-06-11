public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        String binary = decimalToBinary(decimal);
        System.out.println("Binary: " + binary);
    }

    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            return decimalToBinary(decimal / 2) + (decimal % 2);
        }
    }
}
