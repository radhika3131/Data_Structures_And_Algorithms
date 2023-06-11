public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);
    }

    private static int binaryToDecimal(String binary) {
        if (binary.length() == 0) {
            return 0;
        } else {
            int lastDigit = binary.charAt(binary.length() - 1) - '0';
            String remainingDigits = binary.substring(0, binary.length() - 1);
            return (lastDigit * (int) Math.pow(2, binary.length() )) + binaryToDecimal(remainingDigits);
        }
    }
}
