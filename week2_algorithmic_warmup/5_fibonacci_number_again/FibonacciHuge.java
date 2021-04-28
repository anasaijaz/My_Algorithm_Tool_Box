import java.util.*;

public class FibonacciHuge {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long s = pisanoPeriodLength(m);
        long t = n%s;
        long q = getFibonacci(t , m);
        System.out.println(q);
    }

    private static long pisanoPeriodLength(long m) {
        long f = 0;
        long s = 1;
        long t;
        long period = 0;
        while(true){
            long temp = s;
            s = (f+s)%m;
            f = temp;

            period++;
            if(f == 0 && s == 1 && period>0)
                break;
        }
        return period;
    }
    private static long getFibonacci(long n , long m){
        if(n==0)
            return 0;
        if(n==1||n==2)
            return 1;
        long f = 1;
        long s = 1;
        for(int i = 1 ; i < n-1; i++){
            long temp = s%m;
            s = (f + s)%m;
            f = temp;
        }
        return s;

    }

    private static long pisanoPeriodLength2(long m) {
        long F1 = 0, F2 = 1, F = F1 + F2, length = 0;
        for (int i = 0; i < m * m; i++) {
            F = (F1 + F2) % m;
            F1 = F2;
            F2 = F;
            if (F1 == 0 && F2 == 1) {
                length = i + 1;
                break;
            }
        }
        return length;
    }
}

