package ex_03_Operators;

public class Lab028_LargetstNumber {
        public static void main(String[] args) {

            int a = 10, b = 25, c = 20;
            int largest = (a > b && a > c) ? a : (b > c ? b : c);
            System.out.println("Largest number is: " + largest);
        }


}
