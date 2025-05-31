package ex_08_Functions;

public class Lab089_SumOfDigits {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
}
