package Levels.Level1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Write a program to check if a number is divisible by 5
        Scanner sc = new Scanner(System.in);
        int divNumber = sc.nextInt();
        System.out.println("Is the number " + divNumber + " divisible by 5? " + (divNumber % 5 == 0));
    }
}
