package homework170624;

public class MathUtils {

    public static int sign(int a) {
        int result = 0;
        if (a > 0) result = 1;
        if (a < 0) result = -1;
        return result;
    }

    public static int mod(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    public static boolean isPrime(int a) {
        if (a < 3) return false;
        else for (int i = 2; i < a - 1; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isFibonacci(int a) {
        int fibonacci_first = 0, fibonacci_second = 1, temp;
        if (a == 0 || a == 1) return true;

        while (fibonacci_second < a) {
            temp = fibonacci_first + fibonacci_second;
            if (temp == a) return true;
            else {
                fibonacci_first = fibonacci_second;
                fibonacci_second = temp;
            }
        }

        return false;
    }

}
