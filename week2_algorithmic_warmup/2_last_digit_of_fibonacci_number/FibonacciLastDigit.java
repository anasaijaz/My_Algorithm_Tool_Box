import java.util.*;

public class FibonacciLastDigit {
     private static long getFibonacciLastDigitNaive(long n , int m) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous%m;
            previous = current%m;
            current = tmp_previous + current%m;
        }

        return current % m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int m = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n , m);
        System.out.println(c);

    }
}

