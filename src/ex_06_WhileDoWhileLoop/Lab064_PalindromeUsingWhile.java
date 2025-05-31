package ex_06_WhileDoWhileLoop;

public class Lab064_PalindromeUsingWhile {
    public static void main(String[] args) {
        int num = 1234321, original = num, rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Palindrome: " + (original == rev));

    }
}
