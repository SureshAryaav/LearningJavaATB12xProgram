package ex_03_Operators;

public class Lab019_BitwiseOperator {
        public static void main(String[] args) {
            int a = 5;  // 0101
            int b = 3;  // 0011
            System.out.println("AND: " + (a & b));  // 0001 = 1
            System.out.println("OR: " + (a | b));   // 0111 = 7
            System.out.println("XOR: " + (a ^ b));  // 0110 = 6
            System.out.println("Complement: " + (~a)); // 1010 = -6 (in 2's complement)
            System.out.println("Left Shift: " + (a << 1));  // 1010 = 10
            System.out.println("Right Shift: " + (a >> 1)); // 0010 = 2
        }
    }


