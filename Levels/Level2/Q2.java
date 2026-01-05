package Levels.Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Create a program to find the bonuses of employees based on their years of service.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = ₹" + bonus);
        } else {
            System.out.println(0);
        }
    }
}
