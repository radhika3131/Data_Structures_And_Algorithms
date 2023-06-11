public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 25;
        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    private static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "";
        } else {
            int remainder = decimal % 16;
            String hexDigit = getHexDigit(remainder);
            return decimalToHexadecimal(decimal / 16) + hexDigit;
        }
    }

    private static String getHexDigit(int value) {
        if (value < 10) {
            return String.valueOf(value);
        } else {
            char ch = (char) ('A' + (value - 10));
            return String.valueOf(ch);
        }
    }
}

