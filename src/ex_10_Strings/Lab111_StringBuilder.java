package ex_10_Strings;

public class Lab111_StringBuilder {
    /**
     * The main method demonstrates the usage of the StringBuilder class, showcasing
     * operations such as appending a string and inserting a string at a specific position.
     *
     * @param args the command-line arguments passed to the program
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Suresh");
        sb.append(" Aryaav");
        System.out.println(sb);

        sb.insert(0,"Hello");
        System.out.println(sb);
    }
}
