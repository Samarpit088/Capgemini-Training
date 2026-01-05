package Levels.Level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Create a program to find the multiplication table of a number entered by the user from 6 to 9.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
