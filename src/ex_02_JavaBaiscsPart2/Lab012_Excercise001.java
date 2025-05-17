package ex_02_JavaBaiscsPart2;

import java.util.Scanner;

public class Lab012_Excercise001 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.printf("%d * 1 = %d\n", num, num * 1);
        System.out.printf("%d * 2 = %d\n", num, num * 2);
        System.out.printf("%d * 3 = %d\n", num, num * 3);
        System.out.printf("%d * 4 = %d\n", num, num * 4);
        System.out.printf("%d * 5 = %d\n", num, num * 5);
        System.out.printf("%d * 6 = %d\n", num, num * 6);
        System.out.printf("%d * 7 = %d\n", num, num * 7);
        System.out.printf("%d * 8 = %d\n", num, num * 8);
        System.out.printf("%d * 9 = %d\n", num, num * 9);
        System.out.printf("%d * 10 = %d\n", num, num * 10);
    }
}