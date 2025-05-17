package ex_03_Operators;

public class Lab025_ternaryOperator {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println(a>b?a:b); //20

        int x = 5, y = 10;
        int max = (x > y) ? x : y;
        System.out.println("Maximum: " + max);  // 10
    }
}
