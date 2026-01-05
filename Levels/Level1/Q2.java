package Levels.Level1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Write a program to check if the first is the smallest of the 3 numbers.
        Scanner sc = new Scanner(System.in);
        int smallA = sc.nextInt(), smallB = sc.nextInt(), smallC = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (smallA < smallB && smallA < smallC));
    }
}
