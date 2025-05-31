package ex_10_Strings;

public class Lab112_ReverseStringUSingStringBuilder {
    public static void main(String[] args) {
        //✅ StringBuffer is thread-safe (synchronized)
        //✅ StringBuilder is not thread-safe (not synchronized)
        //☠ StringBuilder is faster than StringBuffer
        //☠ StringBuilder is not thread-safe
        //☠ StringBuilder is mutable
    
        StringBuilder sb=new StringBuilder("Aryaav");
        sb.reverse();
        System.out.println(sb);

        StringBuffer s2=new StringBuffer("Ayyanna");
        s2.reverse();
        System.out.println(s2);
    }
}
