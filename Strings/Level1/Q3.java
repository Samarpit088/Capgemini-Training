package Strings.Level1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.next();
        char[] userArray = getChars(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareCharArrays(userArray, builtInArray);
        System.out.println("Are both arrays SAME? " + result);
    }
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}
