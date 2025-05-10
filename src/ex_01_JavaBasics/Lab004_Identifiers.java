package ex_01_JavaBasics;

import java.util.Scanner;

public class Lab004_Identifiers {
    public static void main(String[] args) {
    /*
    * These are names created by programmers to identify various program elements
    * such as variables, methods, classes, and interfaces
    * */
        // Sample identifiers to test
        String[] samples = {"_Test1", "$Test2", "1name", "myVar", "$money", "class", "user123", "void", "$", "_"};

        for (String identifier : samples) {
            if (isValidIdentifier(identifier)) {
                System.out.println(identifier + " is a VALID Java identifier.");
            } else {
                System.out.println(identifier + " is NOT a valid Java identifier.");
            }
        }
    }

    public static boolean isValidIdentifier(String s) {
        if (s == null || s.isEmpty()) return false;

        // First character must be a valid Java identifier start
        if (!Character.isJavaIdentifierStart(s.charAt(0))) return false;

        // Remaining characters must be valid Java identifier parts
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isJavaIdentifierPart(s.charAt(i))) return false;
        }

        // Cannot be a reserved keyword (like class, void, etc.)
        String[] keywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
                "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile", "while"
        };
        for (String keyword : keywords) {
            if (s.equals(keyword)) return false;
        }

        return true;
    }
}
