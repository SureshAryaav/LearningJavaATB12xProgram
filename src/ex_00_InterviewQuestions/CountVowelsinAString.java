package ex_00_InterviewQuestions;

public class CountVowelsinAString {
    public static void main(String[] args) {
        String str = "This is a test string";
        int vowels = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowels);
    }
}
