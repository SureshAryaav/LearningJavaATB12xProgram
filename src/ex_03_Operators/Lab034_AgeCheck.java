package ex_03_Operators;

import java.util.Scanner;

public class Lab034_AgeCheck {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the age:");
        int age= input.nextInt();

        String Category = age > 18 ? (age < 65 ?" Adult":"senior citizen"): "Minor";
        System.out.println(Category);

    }
}
