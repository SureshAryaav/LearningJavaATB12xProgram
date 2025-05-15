package ex_02_JavaBaiscsPart2;

public class Lab010_printfStatement {
    public static void main(String[] args) {
        System.out.printf("Hello %s", "World");
        //printf -> `printf basically adds formatting to the output.`

        int age = 25;
        System.out.printf("My age is %d", age);

        double price = 45.99;
        System.out.printf("\nPrice: $%.2f", price);

        boolean isJavaFun = true;
        System.out.printf("\nIs Java Fun? %b", isJavaFun);

        char grade = 'A';
        System.out.printf("\nMy grade is: %c", grade);

        String name = "John";
        int score = 95;
        System.out.printf("\n%s scored %d points", name, score);

        // Width specification
        System.out.printf("\n|%10s|", "Hello");  // Right-aligned with width 10
        System.out.printf("\n|%-10s|", "Hello"); // Left-aligned with width 10

        // Precision for floating points
        double pi = Math.PI;
        System.out.printf("\nPi with 3 decimals: %.3f", pi);
    }
}
