package ex_06_WhileDoWhileLoop;

public class Lab068_FactorialUsingDoWhile {
    public static void main(String[] args) {
        int num = 5, factorial = 1;
        do {
            factorial *= num;
            num--;
        } while (num > 0);
        System.out.println("Factorial: " + factorial);
    }
}
