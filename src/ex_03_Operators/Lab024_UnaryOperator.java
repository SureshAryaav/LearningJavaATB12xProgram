package ex_03_Operators;

public class Lab024_UnaryOperator {
        public static void main(String[] args) {
            int a = 10;
            System.out.println("Post-Increment: " + a++);  // 10 (then a becomes 11)
            System.out.println("Pre-Increment: " + ++a);   // 12
            System.out.println("Post-Decrement: " + a--);  // 12 (then a becomes 11)
            System.out.println("Pre-Decrement: " + --a);   // 10
            System.out.println("Unary Minus: " + (-a));    // -10
            System.out.println("Unary Plus: " + (+a));     // 10
        }

}
