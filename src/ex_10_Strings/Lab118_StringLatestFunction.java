package ex_10_Strings;

public class Lab118_StringLatestFunction {
    public static void main(String[] args) {
        String s="Suresh Aryaav";

        System.out.println(s.isBlank());

        String str = "Java\nis\ncool";
        str.lines().forEach(System.out::println);

        //Improved version of trim() using Unicode-aware whitespace removal.
        System.out.println(s.strip());
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());

        //Repeats the string n times.
        System.out.println(s.repeat(3));
    }
}
