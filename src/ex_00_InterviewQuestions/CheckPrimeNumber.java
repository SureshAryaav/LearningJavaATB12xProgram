package ex_00_InterviewQuestions;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
