package Levels.Level3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid Year (Gregorian calendar starts from 1582)");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
