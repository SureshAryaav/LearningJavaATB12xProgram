package ex_10_Strings;

public class Lab101_String {
    public static void main(String[] args) {
        String name="Suresh"; // Stored in String constant pool
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name); //String is Immutable, so not chnaged

        String name3=new String("Suresh"); // Stored in Heap Memory as Object class


    }
}
