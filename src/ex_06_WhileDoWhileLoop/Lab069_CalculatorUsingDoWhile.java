package ex_06_WhileDoWhileLoop;

import java.util.Scanner;

public class Lab069_CalculatorUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add 2.Subtract 3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println("Result: " + (5 + 3)); break;
                case 2: System.out.println("Result: " + (5 - 3)); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid!");
            }
        } while (choice != 3);
    }
}
