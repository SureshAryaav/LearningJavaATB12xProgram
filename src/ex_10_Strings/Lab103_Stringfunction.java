package ex_10_Strings;

public class Lab103_Stringfunction {
    public static void main(String[] args) {
        char c='A';
        System.out.println(c);

        String s="Suresh";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.toLowerCase()); //String 2 of s1 created in string pool
        System.out.println(s.toUpperCase()); //String 3 of s1 created in string pool

        System.out.println(s.substring(1,3));
        System.out.println(s.concat(" Aryaav" ));
    }
}
