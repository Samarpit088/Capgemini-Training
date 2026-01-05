package Levels.Level2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Rewrite the program 4 FizzBuzz using the while loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter positive number only.");
        } else {
            int i = 1;
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
                i++;
            }
        }
    }
}
