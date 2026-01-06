package Arrays.Level1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double sum = 0;
        int index = 0;

        while(true){
            double num = sc.nextDouble();
            if(num <= 0 || index == 10) break;
            a[index++] = num;
        }

        for(int i = 0; i < index; i++)
            sum += a[i];

        System.out.println("Sum = " + sum);
    }
}
