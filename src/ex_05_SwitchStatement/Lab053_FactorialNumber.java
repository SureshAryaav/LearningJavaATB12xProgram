package ex_05_SwitchStatement;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab053_FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a non-negative integer (0 to " + Integer.MAX_VALUE + "): ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is:\n" + factorial);
        }

        scanner.close();
    }

    // Method to calculate factorial using BigInteger
    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
