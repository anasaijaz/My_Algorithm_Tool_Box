import java.util.*;

public class FibonacciPartialSum {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
//        System.out.println(getFibonacci((to+2)%60)%10 - getFibonacci((from + 1)%60)%10);
        long x = getFibonacci((from + 2) % 60) - 1;
        long y = getFibonacci((to + 2) % 60) - 1;
        long z = getFibonacci((from) % 60);
        System.out.println((y%10-x%10 + z)%10);

    }
    private static long getFibonacci(long n){
        if(n==0)
            return 0;
        if(n==1||n==2)
            return 1;
        long f = 1;
        long s = 1;
        for(long i = 1 ; i < n-1; i++){
            long temp = s;
            s = (f + s);
            f = temp;
        }
        return s;

    }


}

