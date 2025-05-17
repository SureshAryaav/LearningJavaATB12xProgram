package ex_03_Operators;

public class Lab031_NumberOfBits {
        public static void main(String[] args) {
            int num = 13;  // Binary: 1101
            int count = 0;
            while (num > 0) {
                count += num & 1;  // Check last bit
                num >>= 1;         // Right shift
            }
            System.out.println("Number of 1s: " + count);
        }


}
