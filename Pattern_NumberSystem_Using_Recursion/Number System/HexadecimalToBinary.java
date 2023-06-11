public class HexadecimalToBinary {
    public static void main(String[] args) {
        String hexadecimal = "1A";
        String binary = hexadecimalToBinary(hexadecimal);
        System.out.println("Binary: " + binary);
    }

    private static String hexadecimalToBinary(String hexadecimal) {
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < hexadecimal.length(); i++) {
            char ch = hexadecimal.charAt(i);
            binary.append(hexDigitToBinary(ch));
        }
        return binary.toString();
    }

    private static String hexDigitToBinary(char ch) {
        int decimal = Character.digit(ch, 16);
        String binary = decimalToBinary(decimal);
        // Padding to ensure 4 bits per hex digit
        int paddingSize = 4 - binary.length();
        StringBuilder padding = new StringBuilder();
        for (int i = 0; i < paddingSize; i++) {
            padding.append("0");
        }
        return padding.toString() + binary;
    }

    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            return decimalToBinary(decimal / 2) + (decimal % 2);
        }
    }
}

