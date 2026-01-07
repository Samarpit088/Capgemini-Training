package Methods.Level2;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        // Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] f = getFactors(n);

        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Sum = " + sum(f));
        System.out.println("Product = " + product(f));
        System.out.println("Sum of Squares = " + sumOfSquares(f));
    }
    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;

        return factors;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static long product(int[] arr) {
        long p = 1;
        for (int x : arr) p *= x;
        return p;
    }

    static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int x : arr) s += Math.pow(x, 2);
        return s;
    }
}
