package Arrays.Level1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for(int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for(int x : a){
            if(x > 0){
                if(x % 2 == 0) System.out.println(x + " is positive even");
                else System.out.println(x + " is positive odd");
            } else if(x < 0)
                System.out.println(x + " is negative");
            else
                System.out.println("Zero");
        }

        if(a[0] == a[4]) System.out.println("First and Last are Equal");
        else if(a[0] > a[4]) System.out.println("First is Greater");
        else System.out.println("Last is Greater");
    }
}
