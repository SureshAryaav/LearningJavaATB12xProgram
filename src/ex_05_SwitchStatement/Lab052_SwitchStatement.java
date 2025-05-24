package ex_05_SwitchStatement;

import java.util.Scanner;

public class Lab052_SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year and month
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        int days;

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;

            case 2:  // February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28;
                }
                break;

            default:
                System.out.println("Invalid month number.");
                return;
        }

        System.out.println("Number of days: " + days);
        scanner.close();

    }
}