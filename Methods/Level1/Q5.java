package Methods.Level1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Write a program to check whether a number is positive, negative, or zero.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = check(n);

        if (result == 1)
            System.out.println("Positive Number");
        else if (result == -1)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
    static int check(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }
}
