package ex_10_Strings;

public class Lab107_StringIndex {
    /**
     * The main method demonstrates various string operations such as character access, code point retrieval,
     * case-insensitive comparison, and string emptiness check.
     *
     * @param args the command-line arguments passed to the program
     */
    public static void main(String[] args) {
        String s="Suresh";
        System.out.println(s.charAt(0));
        char c=s.charAt(0);
        System.out.println(c);
        System.out.println(s.codePointAt(0));

        //CompareToIgnoreCase
        int result=s.compareToIgnoreCase("suresh");
        System.out.println(result);

        boolean b=s.isEmpty();

        String program="Java";
        System.out.println(program.startsWith(s));
        System.out.println(program.endsWith(s));
        System.out.println(program.contains(s));
        System.out.println(program.indexOf(s));
        System.out.println(program.lastIndexOf(s));
        System.out.println(program.replaceAll("Java", "Python"));
        System.out.println(program.replace('a','o'));
    }
}
