package ex_06_WhileDoWhileLoop;

public class Lab070_ArmStrongNumberusingWhile {
    public static void main(String[] args) {
        int num = 153, original = num, result = 0;
        while (num != 0) {
            int digit = num % 10;
            result += digit * digit * digit;
            num /= 10;
        }
        System.out.println("Armstrong: " + (original == result));

    }
}
