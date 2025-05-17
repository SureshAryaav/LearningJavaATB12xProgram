package ex_03_Operators;

public class Lab023_Equals {
    public static void main(String[] args) {
        //=  --> Assign the value
        //== --> Comparable operator
        //!= --> Not comparable operator
        int a=10, b=20;

        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(!(a==b)); //true
    }
}
