public class CheckFactorion{
    public static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static boolean isFactorion(int num) {
        int OrgNum = num;
        long sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += fact(digit);
            num /= 10;
        }
        return sum == OrgNum;
    }
}
