package ex_04_ConditionalStatements01;

public class Lab041_LargestOf2Numbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int largest = (a > b) ? a : b;
        System.out.println("Largest number is: " + largest);

        if (a > b) {
            System.out.println(a + " is the largest number.");
        } else if (b > a) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
