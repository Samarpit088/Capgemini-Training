package Strings.Level1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Write a program to convert the complete text to lowercase and compare the results
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Complete Text: ");
        String text = sc.nextLine();
        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();
        boolean result = compareStrings(userLower, builtInLower);

        System.out.println("Lowercase using charAt(): " + userLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both SAME? " + result);
    }
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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
