package ex_10_Strings;

public class Lab115_CountVowelsConsonants {

    public static void main(String[] args) {
        String s="Suresh";
        int vowels=0;
        int consonants=0;

        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels: "+vowels+" Consonants: "+consonants);
    }
}
