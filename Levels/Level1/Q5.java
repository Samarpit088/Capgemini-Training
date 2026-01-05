package Levels.Level1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
        Scanner sc = new Scanner(System.in);
        int voterAge = sc.nextInt();

        if(voterAge >= 18)
            System.out.println("The person's age is " + voterAge + " and can vote.");
        else
            System.out.println("The person's age is " + voterAge + " and cannot vote.");
    }
}
