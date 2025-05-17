package ex_03_Operators;

public class Lab029_SwapNumbers {

        public static void main(String[] args) {

            int a = 5, b = 3;
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swap: a = " + a + ", b = " + b);  // After swap: a = 3, b = 5
        }


}
