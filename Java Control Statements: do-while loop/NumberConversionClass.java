class NumberConversionClass {
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
}