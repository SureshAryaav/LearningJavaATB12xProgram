package ex_03_Operators;

public class Lab038_Excercise04 {
    public static void main(String[] args) {
        int i=11;
        i = i++ + ++i; // 11+13=24
        System.out.println(i);

        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b; //11+22+12+22+14+24

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        int i1 = 1, j = 2, k = 3;

        int m = i1-- - j-- - k--; //1-2-3

        System.out.println("i=" + i1 + ", j=" + j + ", k=" + k + ", m=" + m);

    }
}
