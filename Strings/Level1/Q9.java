package Strings.Level1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Write a program to convert the complete text to uppercase and compare the results
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Complete Text: ");
        String text = sc.nextLine();
        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();
        boolean result = compareStrings(userUpper, builtInUpper);
        System.out.println("Uppercase using charAt(): " + userUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both SAME? " + result);
    }
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }
}
