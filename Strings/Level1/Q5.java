package Strings.Level1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Write a program to demonstrate StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        generateException(str);
        handleException(str);
    }
    public static void generateException(String str) {
        System.out.println("Generating Exception...");
        char ch = str.charAt(str.length());
        System.out.println("Character: " + ch);
    }
    public static void handleException(String str) {
        System.out.println("Handling Exception...");
        try {
            char ch = str.charAt(str.length());
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}
