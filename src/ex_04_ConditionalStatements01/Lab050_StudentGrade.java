package ex_04_ConditionalStatements01;

import java.util.Scanner;

public class Lab050_StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter the student's marks (0 - 100): ");
        int marks = sc.nextInt();

        // Top-level if-else
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
        } else {
            // Nested if-else ladder
            if (marks >= 90) {
                System.out.println("Grade: A");
                if (marks >= 95) {
                    System.out.println("Excellent performance!");
                }
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else if (marks >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F (Fail)");
            }
        }

        sc.close();
    }
}
