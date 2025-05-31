package ex_10_Strings;

public class Lab102_StringImmutable {
    public static void main(String[] args) {
        String s1 = "Java";  //String 1 created
       s1= s1.concat(" is a programming language"); //Assigning same value to s1, String 2 created here in string pool
        System.out.println(s1);
    }
}
