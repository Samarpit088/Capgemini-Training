package Methods.Level3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digit Count = " + countDigits(n));
        System.out.println("Sum of Digits = " + sumDigits(digits));
        System.out.println("Sum of Squares = " + sumOfSquares(digits));
        System.out.println("Harshad Number = " + isHarshad(n, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
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

    public static int sumDigits(int[] d) {
        int sum = 0;
        for (int x : d) sum += x;
        return sum;
    }

    public static double sumOfSquares(int[] d) {
        double sum = 0;
        for (int x : d)
            sum += Math.pow(x, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    public static int[][] digitFrequency(int[] d) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int x : d)
            freq[x][1]++;

        return freq;
    }

}
