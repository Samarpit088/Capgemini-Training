package Levels.Level1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Write a program to check if the first, second, or third number is the largest of the three.
        Scanner sc = new Scanner(System.in);
        int largeA = sc.nextInt(), largeB = sc.nextInt(), largeC = sc.nextInt();

        System.out.println("Is the first number the largest? " + (largeA > largeB && largeA > largeC));
        System.out.println("Is the second number the largest? " + (largeB > largeA && largeB > largeC));
        System.out.println("Is the third number the largest? " + (largeC > largeA && largeC > largeB ));
    }
}
