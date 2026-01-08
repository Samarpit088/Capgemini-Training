package Strings.Level1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String userSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        boolean result = compareStrings(userSub, builtInSub);
        System.out.println("Substring using charAt(): " + userSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Are both SAME? " + result);
    }
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
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
