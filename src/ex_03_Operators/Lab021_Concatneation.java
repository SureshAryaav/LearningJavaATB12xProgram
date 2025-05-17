package ex_03_Operators;

public class Lab021_Concatneation {
    public static void main(String[] args) {
        String s1="suresh", s2="Aryaav";

        int a=10, b=20;
        System.out.println(s1+s2);
        System.out.println(a+b);
        System.out.println(s1+a+s2+b); //suresh10Aryaav20
        System.out.println(s1+s2+a+b); //sureshAryaav1020
        System.out.println(s1+s2+(a+b)); //sureshAryaav30
        System.out.println(a+b+s1+s2);  //30sureshAryaav
    }
}
