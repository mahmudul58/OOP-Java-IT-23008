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