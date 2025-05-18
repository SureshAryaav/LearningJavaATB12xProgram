package ex_04_ConditionalStatements01;

public class Lab045_LargestOf3Numbers {
    public static void main(String[] args) {
        int a = 50, b = 30, c = 70;

        if (a > b) {
            if (a > c) {
                System.out.println("Largest: A --->" + a);
            } else {
                System.out.println("Largest: C ---> " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest: B --> " + b);
            } else {
                System.out.println("Largest:C--> " + c);
            }
        }
    }
}
