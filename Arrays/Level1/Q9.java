package Arrays.Level1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int[] arr = new int[r*c];
        int index = 0;

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[index++] = mat[i][j];

        for(int x : arr) System.out.print(x + " ");
    }
}
