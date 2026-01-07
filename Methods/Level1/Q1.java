package Methods.Level1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = calculateSI(p, r, t);

        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
