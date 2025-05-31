package ex_10_Strings;

public class Lab108_StringSubstring {
    public static void main(String[] args) {
        String s1="Suresh Aryaav";
        String s2=s1.substring(2);
        System.out.println(s2);

        System.out.println(s1.substring(2,9));

        char[] arr=s1.toCharArray();
        System.out.println(arr);

        //Strinf format
        System.out.printf("%s",s1);

        long count= "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
