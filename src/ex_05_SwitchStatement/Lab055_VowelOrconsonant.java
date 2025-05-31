package ex_05_SwitchStatement;

public class Lab055_VowelOrconsonant {
    public static void main(String[] args) {
        char ch = 'e';

        switch (Character.toLowerCase(ch)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }
    }
}
