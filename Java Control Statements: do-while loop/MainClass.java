class SumClass {
    public static double sumSequence() {
        double sum = 0.0;
        double current = 1.0;
        do {
            sum += current;
            current -= 0.1;
        } while (current >= 0.1);
        return sum;
    }
}
class DivisorMultipleClass {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
public class MainClass {
    public static void main(String[] args) {
        // SumClass
        double sum = SumClass.sumSequence();
        System.out.println("Sum of sequence 1 + 0.9 + ... + 0.1 = " + sum);

        // DivisorMultipleClass
        int a = 24, b = 36;
        int gcd = DivisorMultipleClass.gcd(a, b);
        int lcm = DivisorMultipleClass.lcm(a, b);
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}
