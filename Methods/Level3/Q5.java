package Methods.Level3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Prime Number = " + isPrime(n));
        System.out.println("Neon Number = " + isNeon(n));
        System.out.println("Spy Number = " + isSpy(n));
        System.out.println("Automorphic Number = " + isAutomorphic(n));
        System.out.println("Buzz Number = " + isBuzz(n));
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
