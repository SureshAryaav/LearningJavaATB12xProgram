package ex_07_ForLoopStatement;

public class Lab072_SumOfNatualNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);  // Output: 15

    }
}
