package ex_04_ConditionalStatements01;

import java.util.Scanner;

public class Lab048_ClassifyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();

        // Check for valid triangle using Triangle Inequality Theorem
        if (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2) {

            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
