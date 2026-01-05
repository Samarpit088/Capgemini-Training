package Levels.Level1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Write a program to check for the natural number and write the sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        int naturalInput = sc.nextInt();

        if(naturalInput > 0){
            int naturalSum = naturalInput*(naturalInput+1)/2;
            System.out.println("The sum of " + naturalInput + " natural numbers is " + naturalSum);
        } else {
            System.out.println("The number " + naturalInput + " is not a natural number");
        }
    }
}
