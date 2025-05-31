package ex_07_ForLoopStatement;

public class Lab079_FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
