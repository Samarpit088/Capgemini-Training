package Methods.Level3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digit Count = " + countDigits(n));
        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(n, digits));

        findLargest(digits);
        findSmallest(digits);
    }
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int x : d)
            if (x == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] d) {
        int p = d.length;
        int sum = 0;
        for (int x : d)
            sum += (int)Math.pow(x, p);
        return sum == n;
    }

    public static void findLargest(int[] d) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int x : d) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }

        System.out.println("Largest Digit = " + max1);
        System.out.println("Second Largest Digit = " + max2);
    }

    public static void findSmallest(int[] d) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int x : d) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min2 = x;
            }
        }

        System.out.println("Smallest Digit = " + min1);
        System.out.println("Second Smallest Digit = " + min2);
    }
}
