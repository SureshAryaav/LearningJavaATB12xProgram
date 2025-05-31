package ex_10_Strings;

import java.util.Scanner;

public class Lab113_ReverseStringWithoutInbuiltMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("::Enter a string::");
        String input_string = input.nextLine();
        String reversed_string = "";
        for(int i=0;i<input_string.length();i++){
            reversed_string = input_string.charAt(i)+reversed_string;

        }
        System.out.println(reversed_string);
    }
}
