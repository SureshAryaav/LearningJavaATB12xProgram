package ex_10_Strings;

public class Lab119_StringLambdaFunction {

    public static void main(String[] args) {
        String s="Suresh";
        s.chars().forEach(c -> System.out.print((char)c + " "));

        System.out.println();
        s.codePoints().forEach(c -> System.out.print(c + " "));

        String result = "java"
                .transform(s1 -> s1.toUpperCase())
                .transform(s1 -> s1 + " 11");
        System.out.println(result);  // JAVA 11


        String str = "Hello\nWorld";
        System.out.println(str.indent(4));  // Adds 4 spaces before each line
    }
}
