package ex_00_InterviewQuestions;

public class FactorialUsingRecursion {
        static int fact(int n) {
            return (n == 0) ? 1 : n * fact(n - 1);
        }

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
