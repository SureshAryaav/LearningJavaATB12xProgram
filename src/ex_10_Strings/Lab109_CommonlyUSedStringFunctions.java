package ex_10_Strings;

public class Lab109_CommonlyUSedStringFunctions {
    public static void main(String[] args) {
        String s1="Suresh";
        String s2=s1.toUpperCase();
        System.out.println(s2);

        String s3=s1.toLowerCase();
        System.out.println(s3);

        String s4=s1.trim();
        System.out.println(s4);

        String s5=s1.replace('S','A');
        System.out.println(s5);

        String s6=s1.replaceAll("Suresh","Aryaav");
        System.out.println(s6  );

        System.out.println( s1.charAt(0));
        System.out.println(s1.substring(2 ));
        System.out.println(s1.substring(2,9));
    }
}
