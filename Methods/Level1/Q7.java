package Methods.Level1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Write a program to find the sum of n natural numbers using loop
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int result = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers = " + result);
    }
    static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
