package ex_08_Functions;

public class Lab088_PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is " + str + " a palindrome? " + isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
