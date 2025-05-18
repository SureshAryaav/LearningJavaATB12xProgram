package ex_04_ConditionalStatements01;

import java.util.Scanner;

public class Lab039_IsNumberPositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        //System.out.println(number > 0 ? "Positive" : (number < 0 ? "Negative" : "Zero"));
        input.close();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
