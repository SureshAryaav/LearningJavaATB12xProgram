package ex_08_Functions;

public class Lab086_FactorialUsingRecursion {
    public static void main(String[] args) {
        int num = 5;
        int fact = factorial(num);
        System.out.println("Factorial: " + fact);
    }
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

}
