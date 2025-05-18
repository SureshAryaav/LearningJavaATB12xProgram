package ex_04_ConditionalStatements01;

public class Lab043_GradeChecker {
    public static void main(String[] args) {
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 45) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

    }
}
