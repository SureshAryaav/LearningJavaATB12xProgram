package ex_10_Strings;

public class Lab116_StringTocharArray {
    public static void main(String[] args) {
        String s="Suresh";
        char[] c=s.toCharArray();

        for(int i=0; i<c.length; i++) {
            System.out.println(c[i]);
        }

        String s2 = new String(c);
        System.out.println(s2);
    }
}
