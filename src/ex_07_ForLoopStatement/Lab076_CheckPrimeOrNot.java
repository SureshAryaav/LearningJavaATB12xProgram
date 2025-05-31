package ex_07_ForLoopStatement;

public class Lab076_CheckPrimeOrNot {
    public static void main(String[] args) {
        int num = 13, count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        System.out.println(num + " is Prime: " + (count == 2));
    }
}
