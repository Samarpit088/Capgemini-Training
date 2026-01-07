package Methods.Level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Write a program that takes a year as input and outputs the Year is a Leap Year or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (isLeap(y))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
    static boolean isLeap(int year) {
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
