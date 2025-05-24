package ex_05_SwitchStatement;

public class Lab054_GradeSystem {
    public static String evaluateGrade(char grade) {
        switch (Character.toUpperCase(grade)) {
            case 'A': return "Excellent";
            case 'B': return "Very Good";
            case 'C': return "Good";
            case 'D': return "Needs Improvement";
            case 'F': return "Fail";
            default: return "Invalid grade";
        }
    }

    public static void main(String[] args) {
        // Sample test
        char inputGrade = 'B';
        String result = evaluateGrade(inputGrade);
        System.out.println("Grade: " + inputGrade + " => " + result);
    }
}
