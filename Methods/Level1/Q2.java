package Methods.Level1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Create a program to find the maximum number of handshakes among N number of students.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int result = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes = " + result);
    }
    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
