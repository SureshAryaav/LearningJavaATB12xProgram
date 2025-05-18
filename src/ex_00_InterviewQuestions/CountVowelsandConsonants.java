package ex_00_InterviewQuestions;

public class CountVowelsandConsonants {
    public static void main(String[] args) {
        String str = "This is a test string";
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
