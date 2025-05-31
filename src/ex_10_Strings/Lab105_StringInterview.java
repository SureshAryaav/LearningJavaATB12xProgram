package ex_10_Strings;

public class Lab105_StringInterview {
    public static void main(String[] args) {
        //== --> Comparable operator ---> String --> Checks the ref location of the objects
        String s1="Suresh"; //String pool

        String s2=new String("Suresh"); //String object Area created in Heap memory

        System.out.println(s1==s2); //false -- Reference location is different

        //== --> Equality operator ---> String --> Checks the content of the objects
        System.out.println(s1.equals(s2)); //true -- Content is same
        System.out.println(s1.equalsIgnoreCase(s2)); //true -- Content is same but ignore the case


    }
}
