import java.util.*;

public class FibonacciSumLastDigit {
   
   
   // 60 is pisano period of 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
//        long s = getFibonacciSumNaive(n);
        long s = getFibonacci((n + 2)%60) - 1;
        System.out.println(s%10);
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

