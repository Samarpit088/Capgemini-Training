package Arrays.Level1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] result = new int[4];

        int k = 0;
        for(int i = 6; i <= 9; i++)
            result[k++] = number * i;

        k = 0;
        for(int i = 6; i <= 9; i++)
            System.out.println(number + " * " + i + " = " + result[k++]);
    }
}
