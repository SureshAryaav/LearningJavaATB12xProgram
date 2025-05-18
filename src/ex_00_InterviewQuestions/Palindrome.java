package ex_00_InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        //Check if a given string is a palindrome.

        String str = "Suresh Aryaav";
        String reversed = "";

        //String rev = new StringBuilder(str).reverse().toString();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
