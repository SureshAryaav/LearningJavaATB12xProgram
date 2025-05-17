package ex_03_Operators;

public class Lab026_NEWOperator {
    public static void main(String[] args) {
        String s1="Aryaav";
        String s2 = new String("Suresh");

        System.out.println(s2);  //Suresh
        System.out.println(s1);  //Aryaav

        System.out.println(s1 instanceof String);  //true
        System.out.println(s2 instanceof String);  //true
    }
}
