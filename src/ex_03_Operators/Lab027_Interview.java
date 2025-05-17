package ex_03_Operators;

public class Lab027_Interview {
    public static void main(String[] args) {
        long l = 10l; // 8 Byte, 64 Bits

        String s1 = "name"; //  8 Byte, 64 Bits

        char a1='A';
        char b1='B';
        System.out.println(a1+b1); // 131 --> ASCII 65+66 = 131

        System.out.println('A' == 65); //true

        short s=10;
        char c='A';
        System.out.println(s+c); //75 --> ASCII 10+65 = 75
    }
}
