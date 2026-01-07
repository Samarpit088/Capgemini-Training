package Methods.Level3;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        // Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);
        int[] reversed = reverseArray(digits);

        System.out.println("Digit Count = " + countDigits(n));
        System.out.println("Digits = " + Arrays.toString(digits));
        System.out.println("Reversed Digits = " + Arrays.toString(reversed));
        System.out.println("Arrays Equal = " + compareArrays(digits, reversed));
        System.out.println("Palindrome Number = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuck(digits));
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

    public static int[] reverseArray(int[] d) {
        int[] rev = new int[d.length];
        for (int i = 0; i < d.length; i++)
            rev[i] = d[d.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] d) {
        int[] rev = reverseArray(d);
        return compareArrays(d, rev);
    }

    public static boolean isDuck(int[] d) {
        for (int x : d)
            if (x == 0) return true;
        return false;
    }
}
