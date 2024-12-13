public class MainClass {
    public static void main(String[] args) {
        // SumClass
        double sum = SumClass.sumSequence();
        CustomPrintClass.pr("Sum of sequence 1 + 0.9 + ... + 0.1 = " + sum);

        // DivisorMultipleClass
        int a = 24, b = 36;
        int gcd = DivisorMultipleClass.gcd(a, b);
        int lcm = DivisorMultipleClass.lcm(a, b);
        CustomPrintClass.pr("GCD of " + a + " and " + b + " = " + gcd);
        CustomPrintClass.pr("LCM of " + a + " and " + b + " = " + lcm);

        // NumberConversionClass
        int decimal = 255;
        String binary = NumberConversionClass.decimalToBinary(decimal);
        String hex = NumberConversionClass.decimalToHexadecimal(decimal);
        String octal = NumberConversionClass.decimalToOctal(decimal);
        CustomPrintClass.pr("Decimal: " + decimal);
        CustomPrintClass.pr("Binary: " + binary);
        CustomPrintClass.pr("Hexadecimal: " + hex);
        CustomPrintClass.pr("Octal: " + octal);

        // Conversion back to decimal
        int decimalFromBinary = NumberConversionClass.binaryToDecimal(binary);
        int decimalFromHex = NumberConversionClass.hexadecimalToDecimal(hex);
        int decimalFromOctal = NumberConversionClass.octalToDecimal(octal);
        CustomPrintClass.pr("Decimal from Binary: " + decimalFromBinary);
        CustomPrintClass.pr("Decimal from Hexadecimal: " + decimalFromHex);
        CustomPrintClass.pr("Decimal from Octal: " + decimalFromOctal);
    }
}
