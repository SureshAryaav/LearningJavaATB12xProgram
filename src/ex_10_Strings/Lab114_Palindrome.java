package ex_10_Strings;

public class Lab114_Palindrome {
    public static void main(String[] args) {
        String s1="Suresh";
        String s2=new StringBuilder(s1).reverse().toString();
        //System.out.println(s1.equals(s2));
        //System.out.println(s1.equalsIgnoreCase(s2));

        if(s1.equalsIgnoreCase(s2))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
