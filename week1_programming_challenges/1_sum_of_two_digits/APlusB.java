import java.util.Scanner;

class APlusB {
    static int sumOfTwoDigits(int first_digit, int second_digit) {
        return first_digit + second_digit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sumOfTwoDigits(a, b));
        display();
    }

    public static void display(){
        long run  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(run);
    }
}