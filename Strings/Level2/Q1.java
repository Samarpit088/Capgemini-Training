package Strings.Level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Write a program to find and return the length of a string without using the length() method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userLen = findLength(text);
        int builtInLen = text.length();

        System.out.println("User Length: " + userLen);
        System.out.println("Built-in Length: " + builtInLen);
    }
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
}