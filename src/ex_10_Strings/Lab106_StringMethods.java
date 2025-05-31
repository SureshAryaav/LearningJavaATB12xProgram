package ex_10_Strings;

public class Lab106_StringMethods {
    public static void main(String[] args) {
        String s1="Suresh"; //Stored in String pool
        String s2="Suresh"; //Stored in String pool

        String s3=new String("Suresh"); //Stored in Sting Object in Heap memory

        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s3)); //false
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); //-32
    }
}
