package Methods.Level3;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        // Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        System.out.println("Perfect Number: " + isPerfect(n));
        System.out.println("Abundant Number: " + isAbundant(n));
        System.out.println("Deficient Number: " + isDeficient(n));
        System.out.println("Strong Number: " + isStrong(n));
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    private static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}
