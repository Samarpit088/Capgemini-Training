package Methods.Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int r1 = recursiveSum(n);
        int r2 = formulaSum(n);

        System.out.println("Recursive Sum = " + r1);
        System.out.println("Formula Sum = " + r2);
        System.out.println("Both results are equal? " + (r1 == r2));
    }
    static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}
