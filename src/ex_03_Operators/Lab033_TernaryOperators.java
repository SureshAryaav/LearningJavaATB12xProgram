package ex_03_Operators;

public class Lab033_TernaryOperators {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a > b ? a : b);

        int x = 5, y = 10;
        int max = (x > y) ? x : y;
        System.out.println("Maximum: " + max);

        int min = (x < y) ? x : y;
        System.out.println("Minimum: " + min);
        int result = (x > y) ? x * y : x + y;
        System.out.println("Result: " + result);

        int z = 10;
        System.out.println((z > 0) ? "Positive" : "Negative");
        System.out.println((z < 0) ? "Negative" : "Positive");
        System.out.println((z == 0) ? "Zero" : "Non-zero");
        System.out.println((z != 0) ? "Non-zero" : "Zero");


        int n = 10;
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
        System.out.println((n % 2 != 0) ? "Odd" : "Even");

    }
}
