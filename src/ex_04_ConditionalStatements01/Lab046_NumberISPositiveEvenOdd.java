package ex_04_ConditionalStatements01;

public class Lab046_NumberISPositiveEvenOdd {
    public static void main(String[] args) {
        int num = 23;
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is negative.");
        }

    }
}
