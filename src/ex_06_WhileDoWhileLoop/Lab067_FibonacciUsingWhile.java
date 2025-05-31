package ex_06_WhileDoWhileLoop;

public class Lab067_FibonacciUsingWhile {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 10, i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }

    }
}
