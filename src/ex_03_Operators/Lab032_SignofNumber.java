package ex_03_Operators;

public class Lab032_SignofNumber {
        public static void main(String[] args) {

            int num = -15;
            String result = (num > 0) ? "Positive" : (num < 0 ? "Negative" : "Zero");
            System.out.println("The number is: " + result);
        }


}
