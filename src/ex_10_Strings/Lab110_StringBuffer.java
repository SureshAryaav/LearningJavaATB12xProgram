package ex_10_Strings;

public class Lab110_StringBuffer {
    /**
     * The main method demonstrates the usage of the StringBuffer class to modify strings dynamically
     * by performing append and insert operations.
     *
     * @param args the command-line arguments passed to the program
     */
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Suresh");
        sb.append(" Aryaav");
        System.out.println(sb);
        sb.insert(0,"Hello");
    }
}
