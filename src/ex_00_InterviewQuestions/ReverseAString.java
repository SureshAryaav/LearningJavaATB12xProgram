package ex_00_InterviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {

        //Write a Java program to reverse a string without using built-in methods.
        // Alternate: Use StringBuilder sb = new StringBuilder(input).reverse().toString();

        String str = "Suresh Aryaav";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
