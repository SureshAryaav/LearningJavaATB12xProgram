package ex_10_Strings;

public class Lab104_StringStorage {
    public static void main(String[] args) {
      String s1="Suresh";
      String s3="Suresh";

      String s2=new String("Suresh");
      String s4=new String("Suresh");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
