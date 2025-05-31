package ex_05_SwitchStatement;

public class Lab060_LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;

        switch ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 1 : 0) {
            case 1: System.out.println(year + " is a Leap Year"); break;
            case 0: System.out.println(year + " is not a Leap Year"); break;
        }
    }
}
