package ex_10_Strings;

public class Lab120_SplitString {
    public static void main(String[] args) {
        String str="Suresh Aryaav";

        String[] arr=str.split(" ");
        for(String s:arr)
            System.out.println(s);
    }
}
