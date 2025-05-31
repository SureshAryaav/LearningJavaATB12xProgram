package ex_09_Arrays;

public class Lab095_ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1,8};
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome: " + isPalindrome);

    }
}
