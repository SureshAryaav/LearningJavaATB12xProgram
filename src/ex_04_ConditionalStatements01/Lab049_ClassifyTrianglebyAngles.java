package ex_04_ConditionalStatements01;

import java.util.Scanner;

public class Lab049_ClassifyTrianglebyAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt();

        if (a1 + a2 + a3 == 180) {
            if (a1 == 90 || a2 == 90 || a3 == 90)
                System.out.println("Right-angled Triangle");
            else if (a1 > 90 || a2 > 90 || a3 > 90)
                System.out.println("Obtuse Triangle");
            else
                System.out.println("Acute Triangle");
        } else {
            System.out.println("Invalid angles for a triangle");
        }
        sc.close();
    }
}
