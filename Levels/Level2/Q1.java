package Levels.Level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Create a program to print odd and even numbers between 1 to the number entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        }
    }
}
