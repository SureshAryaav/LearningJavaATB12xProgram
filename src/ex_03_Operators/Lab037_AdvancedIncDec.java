package ex_03_Operators;

public class Lab037_AdvancedIncDec {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a = " + a); // a = 7
        System.out.println("b = " + b); // b = 5 + 7 = 12

        int x = 3;
        int y = x++ + x++ + ++x; //3+4+6
        System.out.println("x = " + x); // x = 6
        System.out.println("y = " + y); // y = 3 + 4 + 6 = 13

        int a1 = 1;
        int b1 = a1++ + a1++ + a1++ + a1;
        System.out.println("a = " + a1); // a = 4
        System.out.println("b = " + b1); // 1 + 2 + 3 + 4 = 10
    }

}
