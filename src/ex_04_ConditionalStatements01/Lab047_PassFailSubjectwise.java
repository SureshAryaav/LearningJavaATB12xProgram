package ex_04_ConditionalStatements01;

public class Lab047_PassFailSubjectwise {
    public static void main(String[] args) {
        int math = 50, science = 40, english = 60;

        if (math >= 35) {
            if (science >= 35) {
                if (english >= 35) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail in English");
                }
            } else {
                System.out.println("Fail in Science");
            }
        } else {
            System.out.println("Fail in Math");
        }
    }
}
