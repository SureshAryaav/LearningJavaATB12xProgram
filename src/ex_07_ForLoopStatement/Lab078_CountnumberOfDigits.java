package ex_07_ForLoopStatement;

public class Lab078_CountnumberOfDigits {
    public static void main(String[] args) {
        int num = 12345, count = 0;
        for (; num != 0; num /= 10) count++;

        System.out.println("Digits: " + count);
    }
}
