package Arrays.Level1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Create a program to print a multiplication table of a number.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[10];

        for(int i = 1; i <= 10; i++)
            table[i-1] = number * i;

        for(int i = 1; i <= 10; i++)
            System.out.println(number + " * " + i + " = " + table[i-1]);
    }
}
