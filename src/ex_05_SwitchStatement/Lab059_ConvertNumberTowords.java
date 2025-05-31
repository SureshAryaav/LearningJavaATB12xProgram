package ex_05_SwitchStatement;

public class Lab059_ConvertNumberTowords {
    public static void main(String[] args) {
        int number = 3;

        switch (number) {
            case 0: System.out.println("Zero"); break;
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            default: System.out.println("Out of range");
        }
    }
}
